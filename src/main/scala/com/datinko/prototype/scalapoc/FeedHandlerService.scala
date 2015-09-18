package com.datinko.prototype.scalapoc

import spray.routing.HttpService

/**
 * Created by Neil on 18/09/2015.
 */
trait FeedHandlerService extends HttpService {

  def pingRoute = path("ping") {
    get {
      complete("pong!")
    }
  }

  def pongRoute = path("pong") {
    get {
      complete("pong!?")
    }
  }

  def rootRoute = pingRoute ~ pongRoute

}
