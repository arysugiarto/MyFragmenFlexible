package com.example.arysugiarto.myfragmenflexible;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class OptionDialogFragment extends DialogFragment implements View.OnClickListener {
    private Button btnChoose,btnClose;
    private RadioGroup rgOptions;
    private RadioButton rbSaf,rbMou,rbLvg,rbMoyes;
    private OnOptionDialogListener onOptionDialogListener;
    public OptionDialogFragment() {

    }

    public OnOptionDialogListener getOnOptionDialogListener() {
        return onOptionDialogListener;
    }
    public void setOnOptionDialogListener(OnOptionDialogListener onOptionDialogListener){
        this.onOptionDialogListener = onOptionDialogListener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_option_dialog, container, false);
        btnChoose = (Button)view
    }

    @Override
    public void onClick(View v) {

    }
}
