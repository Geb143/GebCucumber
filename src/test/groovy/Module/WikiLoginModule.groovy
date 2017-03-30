package Module

import geb.Module

/**
 * Created by E002465 on 30-03-2017.
 */
class WikiLoginModule extends Module{

    static content={
        englishLink  {$("#js-link-box-en>strong")}
        loginLink     {$("#pt-login>a")}
        uNameTxt       {$("#wpName1")}
        pwdTxt          {$("#wpPassword1")}
        loginBtn        {$("#wpLoginAttempt")}
    }

}
