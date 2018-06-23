package lk.uok.mit.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import lk.uok.mit.helloworld.R;

public class MainFragment extends Fragment {

    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.fragment_main, parent, false);
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.
    // E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        //adding onclick litner for button to display a toast
        Button buttonToast = view.findViewById(R.id.buttonToast);
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Toast from Fragment!!!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
