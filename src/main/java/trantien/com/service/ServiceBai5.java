package trantien.com.service;

public class ServiceBai5 {
    private String name;

    public ServiceBai5(String name) {
        this.name = name;
    }

    public String getName() {
        if (this == null) {
            throw new NullPointerException("UserProfile is null");
        }
        return name;
    }
}
