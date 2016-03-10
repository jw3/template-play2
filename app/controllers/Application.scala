package controllers

import play.api.mvc.{Action, Controller}


class Application extends Controller {

  val index = Action {
    Ok(views.html.index("Welcome to Play 2.5"))
  }
}
