package models
import sorm._
object DB extends  Instance (entities = Seq(Entity[Book]()),url = "jdbc:h2:mem:play"){

}
