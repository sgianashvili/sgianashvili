package Facebook;
import com.Facebook.StepObject.RegisterPageSteps;
import com.Facebook.Utils.ChromRunner;
import com.Facebook.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static com.Facebook.DataObject.RegisterPageData.*;


@Listeners(com.Facebook.Utils.TestListener.class)

public class RegisterPageTest extends ChromRunner{
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Some Details")
    @Link(name = "Example", type = "https://example.org")
    public void test(){
        RegisterPageSteps steps = new RegisterPageSteps();
        steps.GoTocreateMethod()
             .FirstNAmeValue(firstName)
             .LAstNameValue(lastNAme)
             .EmailNAmeValue(eMail)
             .PasswordNameValue(password)
             .MonthValue(month)
             .DataOption(Data)
             .YearOption(year)
             .SetRadioButton(button)
             .SettRadioButton(Register);




    }
}