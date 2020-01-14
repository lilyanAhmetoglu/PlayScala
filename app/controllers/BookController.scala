package controllers
import models.{Book, DB}
import play.api._
import javax.inject._
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import play.api.mvc._

class BookController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.book("hello lily"))
  }
  val  bookForm : Form[Book] = Form{
    mapping(
      "name" -> text
    )(Book.apply)(Book.unapply)
  }

  def create() = Action { implicit request: Request[AnyContent] =>
    val book = bookForm.bindFromRequest.get
    DB.save(book)
    Redirect(routes.BookController.index())
  }
  def show(id : Integer) = TODO
  def edit(id : Integer) = TODO
  def update() = TODO
  def save() = TODO
  def destroy(id : Integer) = TODO
}