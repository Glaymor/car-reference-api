package models

import play.api.libs.json.{Json, OFormat}

final case class Car(
              number: String,
              brand: String,
              color: String,
              year: String
              )

object Car {
  implicit val userFormat: OFormat[Car] = Json.format[Car]
}
