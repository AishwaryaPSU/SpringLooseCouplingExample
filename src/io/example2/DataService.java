package io.example2;

public class DataService implements Service{
    @Override
    public void provideService() {
        System.out.println("Activating data service from Airtel provider...");
    }
}
