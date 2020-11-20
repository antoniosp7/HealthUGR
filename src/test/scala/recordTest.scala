import Food.Food
import record.Record
import controllers.RecordController

class recordTest extends munit.FunSuite {

  var nutrients = List("test","test")
  var food = new Food(45, "test", nutrients)
  val recordController: RecordController = RecordController()
  
  var record = new Record()

  var res = recordController.addFoodToRecord(record,food)

  test("addFoodtoRecord1") {
    assert(clue(record.food.getOrElse(food,0)) == clue(45))
  }

  test("addFoodtoRecord2") {
    assert(clue(record.food.contains(food)) == true)
  }

  test("addFoodtoRecord3") {
    assert(clue(record.food.size) == clue(1))
  }
    
  
}