package com.dpicallo.tealiumcollectapp;

public class DataLayer {

    private DataLayer() {
        // no instantiation
    }

    // Screen Properties
    public static final String SCREEN_NAME = "screen_name";
    public static final String SCREEN_CLASS = "screen_class";

    // User Properties
    public static final String CUSTOMER_ID = "customer_id";
    public static final String USERNAME = "username";

    // Product Properties
    public static final String PRODUCT_ID = "product_id";
    public static final String PRODUCT_NAME = "product_name";
    public static final String PRODUCT_CATEGORY = "product_category";
    public static final String PRODUCT_QUANTITY = "product_quantity";
    public static final String PRODUCT_PRICE = "product_price";

    // Order Properties
    public static final String ORDER_CURRENCY = "order_currency";
    public static final String ORDER_ID = "order_id";
    public static final String ORDER_TOTAL = "order_total";

    // Gaming Properties
    public static final String CURRENCY_TYPE = "currency_type";
    public static final String SCORE = "score";
    public static final String LEVEL = "level";
    public static final String CHARACTER = "character";
    public static final String ACHIEVEMENT_ID = "achievement_id";
    public static final String NUMBER_OF_TOKENS = "number_of_tokens";

    // Travel Properties
    public static final String TRAVEL_ORIGIN = "travel_origin";
    public static final String TRAVEL_DESTINATION = "travel_destination";
    public static final String TRAVEL_START_DATE = "travel_start_date";
    public static final String TRAVEL_END_DATE = "travel_end_date";
    public static final String TRAVEL_CLASS = "travel_class";
    public static final String NUMBER_OF_ROOMS = "number_of_rooms";
    public static final String NUMBER_OF_PASSENGERS = "number_of_passengers";

    public static final String SEARCH_KEYWORD = "search_keyword";
}
