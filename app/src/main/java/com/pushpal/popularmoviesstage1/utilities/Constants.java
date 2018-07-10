package com.pushpal.popularmoviesstage1.utilities;

public class Constants {
    // Constants of The Movie Database API
    public static final String API_KEY = "";
    public static final String BASE_URL = "https://api.themoviedb.org/3/";
    public static final String POPULAR_MOVIES_URL = "movie/popular";
    public static final String TOP_RATED_MOVIES_URL = "movie/top_rated";
    public static final String UPCOMING_MOVIES_URL = "movie/upcoming";
    public static final String NOW_PLAYING_MOVIES_URL = "movie/now_playing";
    public static final String LATEST_MOVIES_URL = "movie/latest";
    public static final String MOVIE_DETAILS_URL = "movie/{id}";
    public static final String LANGUAGES = "configuration/languages";

    public static final String DISCOVER_URL = BASE_URL + "discover/movie?api_key=" + API_KEY;

    // Genres
    public static final String GENRES_LIST_URL = BASE_URL + "/genre/movie/list?api_key=" + API_KEY;

    // Returns base_url, secure_base_url, backdrop_sizes, logo_sizes, poster_sizes, profile_sizes, still_sizes,change_keys
    public static final String IMAGE_CONFIGUTATION_URL = BASE_URL + "/configuration?api_key=" + API_KEY;
    public static final String IMAGE_BASE_URL = "https://image.tmdb.org/t/p/";
    public static final String IMAGE_SIZE_185 = "w185";
    public static final String IMAGE_SIZE_342 = "w342";

    // Movie sorting categories
    public static final String CATEGORY_MOST_POPULAR = "most popular";
    public static final String CATEGORY_TOP_RATED = "top rated";
    public static final String CATEGORY_FAVOURITE = "favourite";

    // Grid arrangement types
    public static final String ARRANGEMENT_COMPACT = "compact";
    public static final String ARRANGEMENT_COZY = "cozy";

    // Samples -------------------------------------------->
    // https://api.themoviedb.org/3/movie/popular?api_key=key
    // https://api.themoviedb.org/3/movie/top_rated?api_key=<<api_key>>&language=en-US&page=1
    // https://api.themoviedb.org/3/discover/movie?api_key=key&language=en-US&sort_by=popularity.desc&include_adult=false
    // &include_video=false&page=1

}