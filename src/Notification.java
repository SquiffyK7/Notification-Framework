import java.io.Serializable;

public class Notification implements Serializable{

    private String message;

    public void setMessage(String message) {
        this.message=message;
    }

    public String getMessage() {
        return this.message;
    }
}
