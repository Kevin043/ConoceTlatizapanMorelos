package mx.edu.utng.conocemorelos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private ArrayList<Entidad> listItems;
    private Context context;

    public Adaptador(ArrayList<Entidad> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View converView, ViewGroup viewGroup) {

        Entidad Item = (Entidad) getItem(position);

        converView = LayoutInflater.from(context).inflate(R.layout.item, null);
        ImageView imgFoto = (ImageView) converView.findViewById(R.id.imgFoto);
        TextView tvTitulo = (TextView) converView.findViewById(R.id.tvTitulo);
        TextView tvContenido = (TextView) converView.findViewById(R.id.tvContenido);
        TextView tvDireccion = (TextView) converView.findViewById(R.id.tvDireccion);

        imgFoto.setImageResource(Item.getImgFoto());
        tvTitulo.setText(Item.getTitulo());
        tvContenido.setText(Item.getContenido());
        tvDireccion.setText(Item.getDireccion());

        return converView;
    }
}
