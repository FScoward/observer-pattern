/**
 * 観察者
 * */
trait Observer {
  def update(subject: Subject): Unit
}
