
package fisglobal.appstore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import fisglobal.appstore.fragments.LoginFragment;
import fisglobal.appstore.utils.Constants;

/**
 * Created by Jaspreet.Chhabra on 5/18/2017.
 */

public class LoginActivity extends AppCompatActivity implements Constants{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        openLoginPage();
    }

    private void openLoginPage(){

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        setAnimation(ft);
        Fragment loginFragment = new LoginFragment();
        ft.replace(R.id.container, loginFragment, LOGIN_FRAGMENT);
        ft.commit();

    }

    private void setAnimation(FragmentTransaction ft){
        ft.setCustomAnimations(R.anim.slide_right_in, R.anim.slide_left_out, R.anim.slide_left_in, R.anim.slide_right_out);
    }
}
