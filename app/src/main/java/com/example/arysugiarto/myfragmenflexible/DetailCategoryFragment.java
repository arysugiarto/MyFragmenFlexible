package com.example.arysugiarto.myfragmenflexible;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailCategoryFragment extends Fragment implements View.OnClickListener{

    private TextView tvCategoryName;
    private TextView tvCategoryDescription;
    private Button btnProfile;
    private Button btnShowDialog;
    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_DESCRIPTION = "extra_description";
    private String description;



   public String getDescription(){
       return description;
   }
   public void setDescription(String description){
       this.description = description;
   }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail_category, container, false);
        tvCategoryName = (TextView) view.findViewById(R.id.tv_category_name);
        tvCategoryDescription = (TextView) view.findViewById(R.id.tv_category_description);
        btnProfile = (Button) view.findViewById(R.id.btn_profile);
        btnProfile.setOnClickListener(this);
        btnShowDialog = (Button) view.findViewById(R.id.btn_show_dialog);
        btnShowDialog.setOnClickListener(this);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable  Bundle savedInstanState){
       super.onActivityCreated(savedInstanState);

       if (savedInstanState !=null){
           String descFormBundle = savedInstanState.getString(EXTRA_DESCRIPTION);
           setDescription(descFormBundle);
       }
       String categoryName = getArguments().getString(EXTRA_NAME);
       tvCategoryName.setText(categoryName);
       tvCategoryDescription.setText(getDescription());
    }
    /*
    Gunakan method ini jika kita ingin menjaga data agar tetap aman ketika terjadi config changes (portrait - landscape)
     */
    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putString(EXTRA_DESCRIPTION,getDescription());
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_profile:
                break;
            case R.id.btn_show_dialog:
                break;
        }
    }
}