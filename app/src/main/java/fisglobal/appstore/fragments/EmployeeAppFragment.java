package fisglobal.appstore.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fisglobal.appstore.R;
import fisglobal.appstore.adapters.BusinessAppAdapter;
import fisglobal.appstore.adapters.EmployeeAppAdapter;

/**
 * Created by Jaspreet.Chhabra on 5/18/2017.
 */

public class EmployeeAppFragment extends Fragment {

    private RecyclerView appsGrid;
    private static EmployeeAppFragment instance;

    public static EmployeeAppFragment getInstance() {
        if(instance==null)
            instance=new EmployeeAppFragment();
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
        return inflater.inflate(R.layout.fragment_business_app, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        appsGrid=(RecyclerView) view.findViewById(R.id.appsGrid);
        appsGrid.setLayoutManager(new GridLayoutManager(getContext(), 3));
        appsGrid.setAdapter(new EmployeeAppAdapter(getContext()));
    }
}
