package models

import play.api.libs.json.Json

case class Book(Title: String) {
    object Book{
      implicit val bookFormat = Json.format[Book]
    }
}
