package models

import play.api.libs.json.{Json, OFormat}

case class Person(id:Long, name:String, age:Int)

object Person{
  implicit val personFormat: OFormat[Person] = Json.format[Person]
}
