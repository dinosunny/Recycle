package com.cabot.dino.recycle.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dino on 19/09/16.
 */
public class DummyData {
    private static final String[] titles  = {"Good Morning", "Good Noon",
            "Good Evening"} ;
    private static final int[] icons = {android.R.drawable.ic_popup_reminder, android.R.drawable.ic_menu_add,
            android.R.drawable.ic_menu_delete};

    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();

        //Repeat process n times, so that we have enough data to demonstrate a scrollable
        //RecyclerView
        for (int x = 0; x < 3; x++) {
            //create ListItem with dummy data, then add them to our List
            for (int i = 0; i < titles.length && i < icons.length; i++) {
                ListItem item = new ListItem();
                item.setImageResId(icons[i]);
                item.setTitle(titles[i]);
                data.add(item);
            }
        }
        return data;
    }

}

