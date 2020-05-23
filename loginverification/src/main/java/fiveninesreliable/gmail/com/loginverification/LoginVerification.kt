package fiveninesreliable.gmail.com.loginverification

class LoginVerification {
    fun verify(email: String, password: String): Boolean {
        return email == "test@globomatics.com" &&
                password == "test123"
    }
}