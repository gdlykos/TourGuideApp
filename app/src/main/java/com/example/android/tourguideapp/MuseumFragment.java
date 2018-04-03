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
public class MuseumFragment extends Fragment {

    public MuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create an array list
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.string.museum_first_address, R.string.museum_first_title, R.drawable.acropolis_museum));
        places.add(new Place(R.string.museum_second_address, R.string.museum_second_title, R.drawable.national_archaeological_museum));
        places.add(new Place(R.string.museum_third_address, R.string.museum_third_title, R.drawable.benaki_museum));
        places.add(new Place(R.string.museum_forth_address, R.string.museum_forth_title, R.drawable.cycladic_art_museum));
        places.add(new Place(R.string.museum_fifth_address, R.string.museum_fifth_title, R.drawable.byzantine_christian_museum));
        places.add(new Place(R.string.museum_sixth_address, R.string.museum_sixth_title, R.drawable.contemporary_art_museum));
        places.add(new Place(R.string.museum_seventh_address, R.string.museum_seventh_title, R.drawable.hellenic_motor_museum));

        // Create an PlaceAdapter, whose data source is a list of Places.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_museum);

        // Find the ListView object with the view ID called list, which is declared in the
        // place_list.xmll file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the PlaceAdapter we created above, so that
        // it will display the list items for each Place in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
