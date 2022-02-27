@main def hello(): Unit = {
  val mailNotifier: MailNotifier = MailNotifier()
  val task: Task = Task()
  task.addObserver(mailNotifier)
  task.addObserver(SlackNotifier())
  task.changeStatus()
}

