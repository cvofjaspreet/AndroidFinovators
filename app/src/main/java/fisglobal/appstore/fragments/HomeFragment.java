package fisglobal.appstore.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fisglobal.appstore.MainActivity;
import fisglobal.appstore.R;

/**
 * Created by Jaspreet.Chhabra on 5/18/2017.
 */

public class HomeFragment extends Fragment implements View.OnClickListener{

    private static HomeFragment instance;
    private AppCompatButton reportsApps,financeApps,employeeApps,businessApps;

    public static HomeFragment getInstance() {
        if(instance==null)
            instance=new HomeFragment();
        return instance;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance=this;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        reportsApps=(AppCompatButton)view.findViewById(R.id.reportsApps);
        financeApps=(AppCompatButton)view.findViewById(R.id.financeApps);
        employeeApps=(AppCompatButton)view.findViewById(R.id.employeeApps);
        businessApps=(AppCompatButton)view.findViewById(R.id.businessApps);

        businessApps.setOnClickListener(this);
        reportsApps.setOnClickListener(this);
        financeApps.setOnClickListener(this);
        employeeApps.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        MainActivity mainActivity=(MainActivity)getActivity();
        switch (view.getId()){

            case R.id.reportsApps:
                mainActivity.onNavigationItemSelected(mainActivity.getNavigationView().getMenu().findItem(R.id.nav_report));
                break;
            case R.id.financeApps:
                mainActivity.onNavigationItemSelected(mainActivity.getNavigationView().getMenu().findItem(R.id.nav_finance));
                break;
            case R.id.businessApps:
                mainActivity.onNavigationItemSelected(mainActivity.getNavigationView().getMenu().findItem(R.id.nav_business_app));
                break;
            case R.id.employeeApps:
                mainActivity.onNavigationItemSelected(mainActivity.getNavigationView().getMenu().findItem(R.id.nav_employee));
                break;
        }
    }
}
