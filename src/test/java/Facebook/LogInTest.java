package Facebook;

import com.Facebook.StepObject.LogInSteps;
import com.Facebook.Utils.ChromRunner;
import com.Facebook.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static com.Facebook.DataObject.LogIn.logIn;
import static com.Facebook.DataObject.LogIn.userName1;

public class LogInTest extends ChromRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Some Details")
    @Link(name = "Example", type = "https://example.org")
    public void testy(){
        LogInSteps steps = new LogInSteps();
               steps.UserNameValue(userName1)
                    .paroliValue(paroli);
                    .SetLogInButton(logIn);



    }
}
