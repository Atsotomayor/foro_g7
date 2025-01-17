package com.otf31.foro_g7.domain.topics.validations

import com.otf31.foro_g7.domain.topics.DataCreateUpdateTopic

interface ValidatorOfTopics {
  fun validate(dataCreateUpdateTopic: DataCreateUpdateTopic)
}
