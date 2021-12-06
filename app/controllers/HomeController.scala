package controllers

import models.PersonRepository
import play.api.mvc._
import play.api._
import play.api.libs.json.Json
import javax.inject._
import scala.concurrent.ExecutionContext

@Singleton
class HomeController @Inject()(repo: PersonRepository, cc: MessagesControllerComponents)
                              (implicit ec: ExecutionContext ) extends MessagesAbstractController(cc){

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  def getPersons = Action.async { implicit request =>
    repo.list().map { people =>
      Ok(Json.toJson(people))
    }
  }
}
