case class Task() extends Subject {
  def changeStatus(): Unit = {
    println("=== [Task] status is changed.")
    println(s"=== [Task] ${this.observers}")
    this.notifyObservers()
  }
}
