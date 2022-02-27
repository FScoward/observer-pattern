import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * 観察対象
 * */
trait Subject {
   val observers: ArrayBuffer[Observer] = ArrayBuffer.empty[Observer]
   def addObserver(observer: Observer): ArrayBuffer[Observer] = {
      observers += observer
   }
   def removeObserver(observer: Observer): ArrayBuffer[Observer] = observers.filterNot(_ == observer)
   def notifyObservers(): ArrayBuffer[Unit] = observers.map(_.update(this))
}