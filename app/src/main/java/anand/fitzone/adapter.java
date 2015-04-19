package anand.fitzone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class adapter extends ArrayAdapter<String>
{

    public adapter(Context context, String[] values) {
        super(context, R.layout.row_layout);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(getContext());
        View theview=inflater.inflate(R.layout.row_layout,parent,false);
        String item=getItem(position);
        TextView name=(TextView) theview.findViewById(R.id.field);
        name.setText(item);
        ImageView image=(ImageView) theview.findViewById(R.id.image);
        if(item=="STEPS")
            image.setImageResource(R.drawable.steps);
        if(item=="WEIGHT")
            image.setImageResource(R.drawable.weight);
        if(item=="WATER INTAKE")
            image.setImageResource(R.drawable.water);
        if(item=="CALORIES")
            image.setImageResource(R.drawable.cal);
        if(item=="MEDICATIONS")
            image.setImageResource(R.drawable.meds);
        if(item=="RUN TRACKING")
            image.setImageResource(R.drawable.track);
        if(item=="FOOD LOG")
            image.setImageResource(R.drawable.food);
        if(item=="ME")
            image.setImageResource(R.drawable.me);
        return theview;
    }
}