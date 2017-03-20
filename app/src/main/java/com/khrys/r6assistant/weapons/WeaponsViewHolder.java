package com.khrys.r6assistant.weapons;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.khrys.r6assistant.R;

/*
 * Created by Chrysler on 3/16/2017.
 * <p>
 * RainbowSixAssistant
*/

class WeaponsViewHolder extends ChildViewHolder {

    ImageView imgArme;
    TextView nomArme;

    WeaponsViewHolder(final View itemView) {
        super(itemView);

        imgArme = (ImageView) itemView.findViewById(R.id.imageVarme);
        nomArme = (TextView) itemView.findViewById(R.id.textVarme);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = itemView.getContext();
                Intent newWeapon = new Intent(context, WeaponActivity.class);
                newWeapon.putExtra("arme", nomArme.getText().toString());
                context.startActivity(newWeapon);
            }
        });
    }
}
