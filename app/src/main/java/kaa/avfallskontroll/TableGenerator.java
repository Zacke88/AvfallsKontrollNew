package kaa.avfallskontroll;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Generator class which is used to generate a new table which holds
 * different transactions.
 *
 * @author Joakim Zakrisson
 * @version 2017-07-26
 */
public class TableGenerator {

    public void generateTable(TableLayout table, ArrayList transactionArray,
                              View view) {

        setTableHeader(table, view);
        setTableRows(table, transactionArray, view);

    }

    //Create table header
    private void setTableHeader(TableLayout table, View view) {

        TableRow row = new TableRow(view.getContext());

        setHeaderText(row, R.string.vehicle, view);
        setHeaderText(row, R.string.article, view);
        setHeaderText(row, R.string.firstWeightTime, view);
        setHeaderText(row, R.string.firstWeight, view);

        table.addView(row);
    }

    //Set header text appearence
    private void setHeaderText(TableRow row, int text, View
            view) {
        TextView tv = new TextView(view.getContext());
        tv.setText(text);
        tv.setTextAppearance(R.style.TextAppearance_AppCompat_Large);
        tv.setTypeface(null, Typeface.BOLD);
        row.addView(tv);
    }

    //Createa table rows
    private void setTableRows(TableLayout table, ArrayList transactionArray,
                              View view) {

        for (int i = 0; i < transactionArray.size(); i++) {
            TableRow row = new TableRow(view.getContext());

            TransactionObject to = (TransactionObject) transactionArray.get(i);

            setRowText(row, to.getVehicle(), view);
            setRowText(row, to.getArticle(), view);
            setRowText(row, to.getFirstWeightTime(),
                    view);
            setRowText(row, to.getFirstWeight(), view);

            ImageView i1v = new ImageView(view.getContext());
            i1v.setImageResource(R.drawable.thumbs_down);
            row.addView(i1v);

            ImageView i2v = new ImageView(view.getContext());
            i2v.setImageResource(R.drawable.thumbs_up);
            row.addView(i2v);

            row.setMinimumHeight(60);
            row.setGravity(Gravity.CENTER_VERTICAL);
            row.setBackground(view.getResources().getDrawable(R.drawable
                    .table_border, null));

            table.addView(row);
        }

        table.setPadding(20, 0, 0, 0);
    }


    //Set row text appearence
    private void setRowText(TableRow row, String text, View
            view) {
        TextView tv = new TextView(view.getContext());
        tv.setText(text);
        tv.setTextAppearance(R.style.TextAppearance_AppCompat_Large_Inverse);
        tv.setTextColor(view.getResources().getColor(R.color
                .colorAccent, null));
        row.addView(tv);
    }

}