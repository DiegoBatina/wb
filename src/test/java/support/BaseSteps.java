package support;

public class BaseSteps {
    protected static Setup driver = new Setup();
    public BaseSteps(){
        //Open browser dimension web
        driver.startweb("chrome");
        //Open browser dimension mobile
        driver.startmobile("chrome");
    }
}
