package io.example2;

public class RoamingService implements Service{
    @Override
    public void provideService() {
        System.out.println("Activating Airtel Roaming...");
    }
}
