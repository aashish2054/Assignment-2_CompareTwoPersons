
import org.scalatest.flatspec.AnyFlatSpec

class PersonTest extends AnyFlatSpec {

  "compare" should "return both are equal" in {
    val person_one = new Person("Scala", 33)
    val person_two = new Person("Scala",33)
    val result = person_one compare person_two
    assert(result==0)
  }

  it should "return person1 is greater" in {
    val person_one = new Person("Scala", 33)
    val person_two = new Person("Scala",15)
    val result = person_one > person_two
    assert(result)
  }

  it should "return person1 is greater because of lengthy name" in{
    val person_one = new Person("HelloWorld", 33)
    val person_two = new Person("Scala",33)
    val result = person_one > person_two
    assert(result)
  }

  it should "return person2 is greater" in {
    val person_one = new Person("Scala", 15)
    val person_two = new Person("Scala",33)
    val result = person_one < person_two
    assert(result)
  }

  it should "return person2 is greater because of lengthy name" in{
    val person_one = new Person("Scala", 33)
    val person_two = new Person("HelloWorld",33)
    val result = person_one < person_two
    assert(result)
  }

  it should "return fail because both are equal" in {
    val person_one = new Person("Scala", 33)
    val person_two = new Person("Scala",33)
    val result = person_one > person_two
    assert(!result)
  }

  it should "return fail because age of person1 is greater" in {
    val person_one = new Person("Scala", 33)
    val person_two = new Person("Scala",15)
    val result = person_one < person_two
    assert(!result)
  }

  it should "return fail because age of person2 is greater" in {
    val person_one = new Person("Scala", 15)
    val person_two = new Person("Scala",33)
    val result = person_one > person_two
    assert(!result)
  }

  it should "return fail because length of person1's name is lengthy" in{
    val person_one = new Person("HelloWorld", 33)
    val person_two = new Person("Scala",15)
    val result = person_one < person_two
    assert(!result)
  }

  it should "return fail because length of person2's name is lengthy" in{
    val person_one = new Person("Scala", 24)
    val person_two = new Person("HelloWorld",24)
    val result = person_one > person_two
    assert(!result)
  }

}
