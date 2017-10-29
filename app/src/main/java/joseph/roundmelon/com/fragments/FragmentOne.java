package joseph.roundmelon.com.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FragmentOne extends android.app.Fragment {

    View view;
    int count;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_one, container, false);

        final TextView countOne = view.findViewById(R.id.countOne);
        count = 0;


        Button incOne = view.findViewById(R.id.incOne);
        incOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                countOne.setText("Count is " + Integer.toString(count));
            }
        });

        return view;
    }


}
