import org.scalatest.flatspec.AnyFlatSpec

class PersonTest  extends AnyFlatSpec {


    "comparison" should "return true because first person can be greater or equal to second person" in {
      val firstPerson = new PersonCompare("Ashish", 15)
      val secondPerson = new PersonCompare("Ashish", 15)
      val result = firstPerson >= secondPerson
      assert(result)
    }


    it should "return true because age of first person is greater" in {
      val firstPerson = new PersonCompare("Ashish", 20)
      val secondPerson = new PersonCompare("Ashish",15)
      val result = firstPerson > secondPerson
      assert(result)
    }

    it should "return true as name of first person is greater" in{
      val firstPerson = new PersonCompare("Chaudhary", 15)
      val secondPerson = new PersonCompare("Ashish",15)
      val result = firstPerson > secondPerson
      assert(result)
    }

    it should "return true as age of second person is greater" in {
      val firstPerson = new PersonCompare("Ashish", 15)
      val secondPerson = new PersonCompare("Ashish",20)
      val result = firstPerson < secondPerson
      assert(result)
    }

    it should "return true because name of first person is greater than second person" in{
      val firstPerson = new PersonCompare("Ashish", 20)
      val secondPerson = new PersonCompare("Chaudhary",20)
      val result = firstPerson < secondPerson
      assert(result)
    }

    it should "return false because both persons are equal" in {
      val firstPerson = new PersonCompare("Ashish", 20)
      val secondPerson = new PersonCompare("Ashish",20)
      val result = firstPerson > secondPerson
      assert(result)
    }

    it should "return false as age of first person is greater" in {
      val firstPerson = new PersonCompare("Ashish", 20)
      val secondPerson = new PersonCompare("Ashish",15)
      val result = firstPerson < secondPerson
      assert(!result)
    }

    it should "return false as age of first person is less" in {
      val firstPerson = new PersonCompare("Ashish", 15)
      val secondPerson = new PersonCompare("Ashish",20)
      val result = firstPerson > secondPerson
      assert(!result)
    }

    it should "return false as length of second person's name is less" in{
      val firstPerson = new PersonCompare("Chaudhary", 20)
      val secondPerson = new PersonCompare("Ashish",20)
      val result = firstPerson < secondPerson
      assert(!result)
    }

    it should "return false as length of first person's name is less" in{
      val firstPerson = new PersonCompare("Ashish", 20)
      val secondPerson = new PersonCompare("Chaudhary",20)
      val result = firstPerson > secondPerson
      assert(!result)
    }

}
