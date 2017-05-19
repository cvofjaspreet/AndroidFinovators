package fisglobal.appstore.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import fisglobal.appstore.MainActivity;
import fisglobal.appstore.R;

/**
 * Created by Jaspreet.Chhabra on 5/18/2017.
 */

public class LoginFragment extends Fragment {

    private AppCompatEditText eID,passCode,password;
    private AppCompatButton submit;
    private LinearLayout confirmLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        eID=(AppCompatEditText)view.findViewById(R.id.employeeId);
        passCode=(AppCompatEditText)view.findViewById(R.id.passCode);
        password=(AppCompatEditText)view.findViewById(R.id.password);
        submit=(AppCompatButton)view.findViewById(R.id.submit);
        confirmLayout=(LinearLayout)view.findViewById(R.id.confirmLayout);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validate()){
                    getActivity().finish();
                    Intent intent=new Intent(getContext(), MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }


    private boolean validate(){

        if(eID.getText().toString().trim().equals(""))
            eID.setError(getString(R.string.enter_eid));
        else{
            if(confirmLayout.getVisibility()==View.GONE)
            confirmLayout.setVisibility(View.VISIBLE);
            else{
                if(password.getText().toString().trim().equals(""))
                    password.setError(getString(R.string.enter_password));
                else if(passCode.getText().toString().trim().equals(""))
                    passCode.setError(getString(R.string.enter_pass_code));
                else
                    return true;
            }

        }

        return false;
    }
}
