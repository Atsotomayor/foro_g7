package com.otf31.foro_g7.domain.users

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.security.core.userdetails.UserDetails

interface UserRepository : JpaRepository<User, Long> {

  fun findByEmail(
    email: String
  ): UserDetails?
}
