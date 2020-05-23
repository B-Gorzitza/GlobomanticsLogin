package fiveninesreliable.gmail.com.loginverification

class LoginVerification {
    fun verifyCredentials(email: String, password: String): Boolean {
        return (email == "test@globomatics.com" &&
                password == "test123") ||
                (email == "admin@globomatics.com" &&
                        password == "admin123")
    }
}