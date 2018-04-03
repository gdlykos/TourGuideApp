package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create an array list
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.string.food_first_address, R.string.food_first_title, R.drawable.a_for_athens));
        places.add(new Place(R.string.food_second_address, R.string.food_second_title, R.drawable.rest_360_degrees));
        places.add(new Place(R.string.food_third_address, R.string.food_third_title, R.drawable.dinner_in_the_sky));
        places.add(new Place(R.string.food_forth_address, R.string.food_forth_title, R.drawable.cinque_wine_deli_bar));
        places.add(new Place(R.string.food_fifth_address, R.string.food_fifth_title, R.drawable.aleria_restaurant));
        places.add(new Place(R.string.food_sixth_address, R.string.food_sixth_title, R.drawable.funky_gourmet));
        places.add(new Place(R.string.food_seventh_address, R.string.food_seventh_title, R.drawable.gb_roof_garden));

        // Create an PlaceAdapter, whose data source is a list of Places.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_food);

        // Find the ListView object with the view ID called list, which is declared in the
        // place_list.xmll file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the PlaceAdapter we created above, so that
        // it will display the list items for each Place in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
