package com.example.alpha.Data;

import com.example.alpha.R;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Project Example 1",
            "Project Example 2",
            "Project Example 3",
            "Project Example 4",
    };

    private static String[] heroDetails = {
            "Detail Project Example 1",
            "Detail Project Example 2",
            "Detail Project Example 3",
            "Detail Project Example 4",
    };

    private static int[] heroesImages = {
            R.drawable.ic_android_blackdp,
            R.drawable.ic_android_blackdp,
            R.drawable.ic_android_blackdp,
            R.drawable.ic_android_blackdp
    };

    public static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}
