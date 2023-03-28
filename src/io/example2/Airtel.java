package io.example2;

public class Airtel {
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void provideService(){
        service.provideService();
    }
}
