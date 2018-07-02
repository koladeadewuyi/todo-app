package controllers

import javax.inject.{Inject, Singleton}
import model.Task
import play.api.i18n.I18nSupport
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class TaskController @Inject()(cc: ControllerComponents) extends AbstractController(cc) with I18nSupport {

  import play.api.data.Forms._
  import play.api.data._

  val taskForm = Form(
    "label" -> nonEmptyText
  )

  def tasks() = Action { implicit messagesProvider =>
    Ok(views.html.index(Task.all(), taskForm))
  }

  def newTask() = TODO

  def deleteTask(id: String) = TODO

}
