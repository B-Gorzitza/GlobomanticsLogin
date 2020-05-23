package fiveninesreliable.gmail.com.globomanticslogin

import fiveninesreliable.gmail.com.loginverification.LoginVerification
import org.junit.Assert.*
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    val verification = LoginVerification()

    @Test
    fun loginSuccessfulWhenCredentialsCorrect() {
        assertTrue(verification.verifyEmailAndPassword("test@globomatics.com", "test123"))
    }

    @Test
    fun loginFailsWhenWrongEmail() {
        assertFalse(verification.verifyEmailAndPassword("test@test.com", "test123"))
    }

    @Test
    fun loginFailsWhenWrongPassword() {
        assertFalse(verification.verifyEmailAndPassword("test@globomatics.com", "test12"))
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}
