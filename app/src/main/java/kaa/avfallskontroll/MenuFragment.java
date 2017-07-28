package kaa.avfallskontroll;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Fragment that holds the main menu for deviation choices.
 *
 * @author Joakim Zakrisson
 * @version 2017-07-27
 */
public class MenuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
    }

    public void setButtonInactive(View view) {
        Button btn = (Button) view.findViewById(R.id.dev_current);
        btn.setEnabled(false);
    }

}
