package com.example.hobbify;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Recipie extends AppCompatActivity {
    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipies> recipies1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipie);

        recipies1 = new ArrayList<>();
        recipies1.add(new Recipies("Chicken Roll","200 gm chopped into cubes chicken\n"+
                "1 medium chopped tomato\n" +
                "1/2 pinch red chill powderIn" +
                "2 tablespoon vegetable oil\n" +
                "1/2 cut into strips cucumber\n" +
                "1/2 tablespoon chopped coriander leaves\n" +
                "1 large thinly sliced onion\n" +
                "2 medium chopped green chilli\n" +
                "2 pinches garam masala powder\n"+
                "1 lemon wedges \n" +
                "1 teaspoon tomato ketchup\n" +
                "1 tablespoon green chill sauce","Method","Chicken Roll is a delectable North Indian recipe made using all purpose flour, stir-fried chicken, yoghurt and a variety of vegetables rolled into paranthas. On days you do not want to prepare an elaborate meal, this delectable dish can be a saviour. Rolls are quite popular across India and they are often a favourite evening snack. Egg Roll, Kathi Kebab Roll, Mutton Roll, Paneer Roll, Potato Roll and even Fish Roll are among its many variations. This easy roll recipe is made using chicken and has the unforgettable aroma of Indian spices. You can also utilize your leftover parathas and chapatis in making this recipe. If you do not like to use all-purpose flour or maida, you can make it with whole wheat flour too. In fact, it can be made even with leftover chicken. All you have to ensure is that you use the right amount of spices so that the flavour is not lost. Easy to pack and carry, you can also take it to office or prepare it for picnics and day trips. A must try roll recipe for all chicken lovers!\n",R.drawable.chicken_roll ));

         myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);
         myAdapter = new RecyclerViewAdapter(this,recipies1);
         myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));
         myrecyclerView.setAdapter(myAdapter);
    }
}