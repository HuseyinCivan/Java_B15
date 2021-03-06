package day54;

public class FireFoxDriver implements WebDriver{
    @Override
    public void openBrpwser() {
        System.out.println("Opening Firefox Browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to "+url+" using Firefox Browser");
    }

    @Override
    public void maximize() {
        System.out.println("Maximazing Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox Browser");
    }
}
