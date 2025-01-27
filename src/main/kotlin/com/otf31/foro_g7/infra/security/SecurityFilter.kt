package com.otf31.foro_g7.infra.security

import com.otf31.foro_g7.domain.users.UserRepository
import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component
import org.springframework.web.filter.OncePerRequestFilter
import kotlin.text.replace

@Component
class SecurityFilter @Autowired constructor(
  private val tokenService: TokenService,
  private val userRepository: UserRepository
): OncePerRequestFilter() {

  override fun doFilterInternal(
    request: HttpServletRequest,
    response: HttpServletResponse,
    filterChain: FilterChain
  ) {
    val authHeader = request.getHeader("Authorization")

    if (authHeader != null) {
      val token = authHeader.replace("Bearer ", "")
      val email = tokenService.getSubject(token)

      if (email != null) {
        val usuario = userRepository.findByEmail(email)

        if (usuario != null) {
          val context = SecurityContextHolder.createEmptyContext()
          val authentication = UsernamePasswordAuthenticationToken(usuario, null, usuario.authorities)
          context.authentication = authentication

          SecurityContextHolder.setContext(context)
        }
      }
    }

    filterChain.doFilter(request, response)
  }
}
