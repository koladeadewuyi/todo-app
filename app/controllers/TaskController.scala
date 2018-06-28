package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}
import play.api.i18n.I18nSupport

@Singleton
class TaskController @Inject()(cc: ControllerComponents) extends AbstractController(cc) with I18nSupport {

  def tasks() = {}

  def newTask() = TODO

  def deleteTask(id: String) = TODO

}
