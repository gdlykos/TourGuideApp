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
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create an array list
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.string.shopping_first_address, R.string.shopping_first_title, R.drawable.the_mall_athens));
        places.add(new Place(R.string.shopping_second_address, R.string.shopping_second_title, R.drawable.athens_metromall));
        places.add(new Place(R.string.shopping_third_address, R.string.shopping_third_title, R.drawable.athens_heart_mall));
        places.add(new Place(R.string.shopping_forth_address, R.string.shopping_forth_title, R.drawable.village_shopping));
        places.add(new Place(R.string.shopping_fifth_address, R.string.shopping_fifth_title, R.drawable.river_west));
        places.add(new Place(R.string.shopping_sixth_address, R.string.shopping_sixth_title, R.drawable.ermou_street));

        // Create an PlaceAdapter, whose data source is a list of Places.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_shopping);

        // Find the ListView object with the view ID called list, which is declared in the
        // place_list.xmll file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the PlaceAdapter we created above, so that
        // it will display the list items for each Place in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
