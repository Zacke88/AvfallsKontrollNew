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
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        // initialise your views
        TableLayout table = (TableLayout) view.findViewById(R.id
                .current_table);

        TableRow row0 = new TableRow(getContext());

        TextView tv0 = new TextView(getContext());
        tv0.setText(R.string.reg);
        tv0.setTextAppearance(R.style.TextAppearance_AppCompat_Large);
        tv0.setTypeface(null, Typeface.BOLD);
        row0.addView(tv0);

        TextView tv1 = new TextView(getContext());
        tv1.setText(R.string.waste);
        tv1.setTextAppearance(R.style.TextAppearance_AppCompat_Large);
        tv1.setTypeface(null, Typeface.BOLD);
        row0.addView(tv1);

        TextView tv2 = new TextView(getContext());
        tv2.setText(R.string.business);
        tv2.setTextAppearance(R.style.TextAppearance_AppCompat_Large);
        tv2.setTypeface(null, Typeface.BOLD);
        row0.addView(tv2);

        TextView tv3 = new TextView(getContext());
        tv3.setText(R.string.weight);
        tv3.setTextAppearance(R.style.TextAppearance_AppCompat_Large);
        tv3.setTypeface(null, Typeface.BOLD);
        row0.addView(tv3);

        table.addView(row0);

        for (int i = 0; i < 5; i++) {
            TableRow tbrow = new TableRow(getContext());

            TextView t1v = new TextView(getContext());
            t1v.setText("ABC 12" + i + "        ");
            t1v.setTextAppearance(R.style.TextAppearance_AppCompat_Large_Inverse);
            t1v.setTextColor(getResources().getColor(R.color
                    .colorAccent, null));
            tbrow.addView(t1v);

            TextView t2v = new TextView(getContext());
            t2v.setText("20" + i + "        ");
            t2v.setTextAppearance(R.style.TextAppearance_AppCompat_Large_Inverse);
            t2v.setTextColor(getResources().getColor(R.color.colorAccent,
                    null));
            tbrow.addView(t2v);

            TextView t3v = new TextView(getContext());
            t3v.setText("TVAB" + i + "        ");
            t3v.setTextAppearance(R.style
                    .TextAppearance_AppCompat_Large_Inverse);
            t3v.setTextColor(getResources().getColor(R.color.colorAccent,
                    null));
            tbrow.addView(t3v);

            TextView t4v = new TextView(getContext());
            t4v.setText("1" + i + " ton" + "        ");
            t4v.setTextAppearance(R.style.TextAppearance_AppCompat_Large_Inverse);
            t4v.setTextColor(getResources().getColor(R.color.colorAccent,
                    null));
            tbrow.addView(t4v);

            ImageView i1v = new ImageView(getContext());
            i1v.setImageResource(R.drawable.thumbs_down);
            tbrow.addView(i1v);

            ImageView i2v = new ImageView(getContext());
            i2v.setImageResource(R.drawable.thumbs_up);
            tbrow.addView(i2v);

            tbrow.setMinimumHeight(60);
            tbrow.setGravity(Gravity.CENTER_VERTICAL);
            tbrow.setBackground(getResources().getDrawable(R.drawable
                    .table_border, null));

            table.addView(tbrow);
        }

        table.setPadding(20, 0, 0, 0);
    }
}
