// ISP Solution:
// Small interfaces are created based on actual device capabilities.
// BasicPhone is not forced to implement unused methods.

interface Caller {
    void makeCall(String number);
}

interface Messenger {
    void sendSms(String number, String message);
}

interface Browser {
    void browseWeb(String url);
}

interface Camera {
    void takePicture();
}

// SmartPhone combines all required abilities.
interface SmartPhone extends Caller, Messenger, Browser, Camera {
}

// BasicPhone only supports calling and texting.
class BasicPhone implements Caller, Messenger {

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + " using BasicPhone");
    }

    @Override
    public void sendSms(String number, String message) {
        System.out.println("Sending SMS to " + number + ": " + message);
    }
}

// Samsung supports all smartphone features.
class Samsung implements SmartPhone {

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + " using Samsung");
    }

    @Override
    public void sendSms(String number, String message) {
        System.out.println("Sending SMS to " + number + ": " + message);
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("Browsing " + url + " using Samsung");
    }

    @Override
    public void takePicture() {
        System.out.println("Taking picture using Samsung");
    }
}

// Iphone supports all smartphone features.
class Iphone implements SmartPhone {

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + " using Iphone");
    }

    @Override
    public void sendSms(String number, String message) {
        System.out.println("Sending SMS to " + number + ": " + message);
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("Browsing " + url + " using Iphone");
    }

    @Override
    public void takePicture() {
        System.out.println("Taking picture using Iphone");
    }
}