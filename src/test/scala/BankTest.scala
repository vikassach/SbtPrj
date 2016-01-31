
import com.example.Bank
import org.scalatest.FunSpec
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BankSpec extends FunSpec {
  describe("simple bank") {
    val bank = new Bank

    it("should start with zero balance") {
      assert(bank.balance == 0.0)
    }

    it("should allow deposits") {
      bank.deposit(100.0)
      assert(bank.balance == 100.0)
    }

    it("should allow withdrawals") {
      bank.withdraw(50.0)
      assert(bank.balance == 50.0)
    }

    it("should not allow account to be overdrawn") {
      intercept[IllegalArgumentException]{
        bank.withdraw(60.0) 
      }
    }
  }
}
