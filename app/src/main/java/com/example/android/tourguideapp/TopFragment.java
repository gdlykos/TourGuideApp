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
public class TopFragment extends Fragment {

    public TopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create an array list
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.string.top_first_address, R.string.top_first_title, R.drawable.acropolis));
        places.add(new Place(R.string.top_second_address, R.string.top_second_title, R.drawable.parthenon));
        places.add(new Place(R.string.top_third_address, R.string.top_third_title, R.drawable.odeon_of_herodes_atticus));
        places.add(new Place(R.string.top_forth_address, R.string.top_forth_title, R.drawable.panathenaic_stadium));

        // Create an PlaceAdapter, whose data source is a list of Places.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_top);

        // Find the ListView object with the view ID called list, which is declared in the
        // place_list.xmll file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the PlaceAdapter we created above, so that
        // it will display the list items for each Place in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
