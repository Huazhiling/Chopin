package com.yat3s.chopin.sample;

import java.util.ArrayList;

import static com.yat3s.chopin.sample.R.array.musics;


/**
 * Created by Yat3s on 7/12/2017.
 * Email: hawkoyates@gmail.com
 * GitHub: https://github.com/yat3s
 */
public class DataRepo {

    private final static int[] ABSTRACT_IMAGE_RESOURCE_ID = {R.mipmap.abstract_1,
            R.mipmap.abstract_2, R.mipmap.abstract_3, R.mipmap.abstract_4};

    public static ArrayList<MusicAdapter.Music> generateMusicData() {
        final String[] musicNames = App.getContext().getResources().getStringArray(musics);
        ArrayList<MusicAdapter.Music> musics = new ArrayList<>();
        for (String taskName : musicNames) {
            musics.add(new MusicAdapter.Music(taskName, generateRandomImageResId()));
        }
        return musics;
    }

    public static int generateRandomImageResId() {
        int randomIndex = (int) (Math.random() * ABSTRACT_IMAGE_RESOURCE_ID.length);
        return ABSTRACT_IMAGE_RESOURCE_ID[randomIndex];
    }
}
