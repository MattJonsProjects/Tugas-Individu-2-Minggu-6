sealed class Shape permits Circle, Rectangle {}

final class Circle extends Shape {}

final class Rectangle extends Shape {}

public final class SecurityToken {
    private final String token;

    public SecurityToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
