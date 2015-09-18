package com.datinko.prototype.scalapoc

import akka.actor.{Props, ActorSystem}
import akka.io.IO
import spray.can.Http

/**
 * Created by Neil on 18/09/2015.
 */
object Main {

  def main (args: Array[String] ) {

    implicit val system = ActorSystem()

    //create a service actor
    val service = system.actorOf(Props[FeedHandlerServiceActor], "nd-rest-service")

    //bind our actor to a HTTP Port
    IO(Http) ! Http.Bind(service, interface = "localhost", port=8000)

  }

}
