package fiveninesreliable.gmail.com.loginverification

class LoginVerification {
    fun verifyEmailAndPassword(email: String, password: String): Boolean {
        return email == "test@globomatics.com" &&
                password == "test123"
    }
}