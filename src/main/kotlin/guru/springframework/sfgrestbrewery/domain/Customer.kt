package guru.springframework.sfgrestbrewery.domain

import java.util.*

data class Customer(var id: UUID = UUID.randomUUID(), var name: String = "")