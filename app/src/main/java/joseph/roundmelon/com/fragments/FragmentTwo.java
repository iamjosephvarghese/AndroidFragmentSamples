package joseph.roundmelon.com.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FragmentTwo extends android.app.Fragment {
    int count;
    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_two, container, false);
        count = 0;
        final TextView countTwo = view.findViewById(R.id.countTwo);
        Button incTwo = view.findViewById(R.id.incTwo);
        incTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                countTwo.setText("Count is " + Integer.toString(count));
            }
        });
        return view;
    }

}
