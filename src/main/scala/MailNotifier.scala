class MailNotifier extends Notifier with Observer {
  override def update(subject: Subject): Unit = {
    println(s"=== [${this.getClass.getName}] send notify.")
    sendNotify()
  }
}
