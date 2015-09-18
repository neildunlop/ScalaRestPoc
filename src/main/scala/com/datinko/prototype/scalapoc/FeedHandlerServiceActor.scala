package com.datinko.prototype.scalapoc

import akka.actor.Actor.Receive
import akka.actor.{ActorRefFactory, Actor}
import spray.routing.HttpService

/**
 * Created by Neil on 18/09/2015.
 */
class FeedHandlerServiceActor extends FeedHandlerService with Actor {

  // the HttpService trait (which GeoTrellisService will extend) defines
  // only one abstract member, which connects the services environment
  // to the enclosing actor or test.
  def actorRefFactory = context

  def receive = runRoute(rootRoute)
}
