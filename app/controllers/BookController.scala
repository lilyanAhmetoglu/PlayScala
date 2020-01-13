package controllers
import models.Book
import play.api._
import javax.inject._
import play.api.data.Form
import play.api.data.Form._
import play.api.mvc._

class BookController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.book("hello lily"))
  }

  def create() = Action { implicit request: Request[AnyContent] =>
    Ok("dsdsdsdsd")
  }
  def show(id : Integer) = TODO
  def edit(id : Integer) = TODO
  def update() = TODO
  def save() = TODO
  def destroy(id : Integer) = TODO
}