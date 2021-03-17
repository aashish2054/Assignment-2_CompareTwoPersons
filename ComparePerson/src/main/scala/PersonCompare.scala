
class PersonCompare(val name: String, val age: Int) extends Ordered[PersonCompare] {


    //Function to compare two persons based on their age if
    // names are same, then compare age
    // if names are not same, then compare their name length
  def compare(that: PersonCompare): Int =

  /*
    if names are same
   */
    if (this.name == that.name) {

      if(this.age < that.age) { -1        //comparing age
      }
      else { 1
      }
    }

    /*
    if name aren't similar
     */
    else {
      if (this.name.length < that.name.length) {
        -1
      }
      else {
        1
      }
    }

}
