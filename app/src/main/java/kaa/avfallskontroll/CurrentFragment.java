package kaa.avfallskontroll;

import android.app.Fragment;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Fragment that displays the current deviations that has not yet been handled.
 *
 * @author Joakim Zakrisson
 * @version 2017-07-27
 */
public class CurrentFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_current, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<TransactionObject> transactionArray = new ArrayList<>();
        generateTransactions(transactionArray);
        generateTable(transactionArray, view);
    }

    // Generate transactions, will get theese from the server in the future
    private void generateTransactions(ArrayList transactionArray) {

        int amount = 9;

        for (int i = 0; i <= amount; i++) {
            TransactionObject to = new TransactionObject();
            to.setVehicle("ABC 12" + i + "        ");
            to.setArticle("20" + i + "        ");
            to.setFirstWeightTime("13:0" + i + "        ");
            to.setFirstWeight("1" + i + " ton        ");
            transactionArray.add(to);
        }
    }

    public void generateTable(ArrayList transactionArray, View view) {
        // Get TableLayout from view
        TableLayout table = (TableLayout) view.findViewById(R.id
                .current_table);

        //Generate new table
        TableGenerator tg = new TableGenerator();
        tg.generateTable(table, transactionArray, view);

    }
}
