package tk.gamesolc.lifeinaapp;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends ArrayAdapter<String[]> {

    public ListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public ListAdapter(Context context, int resource, List<String[]> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_row, null);
        }

        String[] p = getItem(position);

        if (p != null) {
            TextView tt1 = (TextView) v.findViewById(/**R.id.id**/R.id.cast_notification_id);
            TextView tt2 = (TextView) v.findViewById(/**R.id.categoryId**/R.id.cast_notification_id);
            TextView tt3 = (TextView) v.findViewById(/**R.id.description**/R.id.cast_notification_id);

            if (tt1 != null) {
                tt1.setText(/**p.getId()**/null);
            }

            if (tt2 != null) {
                tt2.setText(/**p.getCategory().getId()**/null);
            }

            if (tt3 != null) {
                tt3.setText(/**p.getDescription()**/null);
            }
        }

        return v;
    }

}