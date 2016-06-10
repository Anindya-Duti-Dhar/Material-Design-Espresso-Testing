package com.creation.anindya.espressotestingbyanindya.provider;

import android.content.SearchRecentSuggestionsProvider;


public class AppRecentSearchesProvider extends SearchRecentSuggestionsProvider {

    public final static String AUTHORITY = "com.creation.anindya.espressotestingbyanindya";
    public final static int MODE = DATABASE_MODE_QUERIES;

    public AppRecentSearchesProvider() {
        setupSuggestions(AUTHORITY, MODE);
    }

}
