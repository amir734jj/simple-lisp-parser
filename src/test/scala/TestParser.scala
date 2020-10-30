import org.scalatest.flatspec._
import org.scalatest.matchers._

class TestParser extends AnyFlatSpec with should.Matchers {

  import Parser._

  "A Lisp parser" should "add correctly" in {
    parse("(+ %s %s)".format(2, 1)).toLong should be (3)
  }

  it should "subtract correctly" in {
    parse("(- %s %s)".format(2, 1)).toLong should be (1)
  }

  it should "< correctly" in {
    parse("(< %s %s)".format(2, 1)).toBoolean should be (false)
  }

  it should "> correctly" in {
    parse("(> %s %s)".format(2, 1)).toBoolean should be (true)
  }

  it should "if correctly" in {
    parse("(if (< %s %s) %s %s)".format(2, 1, 2, 1)).toLong should be (1)
  }
}
