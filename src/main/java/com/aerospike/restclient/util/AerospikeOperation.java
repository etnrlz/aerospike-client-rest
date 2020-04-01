package com.aerospike.restclient.util;

public enum AerospikeOperation {

    // Operation constants. Used to decode for the /operate endpoints
    ADD,
    APPEND,
    GET,
    PREPEND,
    READ,
    GET_HEADER,
    TOUCH,
    PUT,

    // List Operation Constants
    LIST_APPEND,
    LIST_APPEND_ITEMS,
    LIST_CLEAR,
    LIST_GET,
    LIST_GET_BY_INDEX,
    LIST_GET_BY_INDEX_RANGE,
    LIST_GET_BY_RANK,
    LIST_GET_BY_RANK_RANGE,
    LIST_GET_BY_VALUE,
    LIST_GET_BY_VALUE_RANGE,
    LIST_GET_BY_VALUE_LIST,
    LIST_GET_RANGE,
    LIST_INCREMENT,
    LIST_INSERT,
    LIST_INSERT_ITEMS,
    LIST_POP,
    LIST_POP_RANGE,
    LIST_REMOVE,
    LIST_REMOVE_BY_INDEX,
    LIST_REMOVE_BY_INDEX_RANGE,
    LIST_REMOVE_BY_RANK,
    LIST_REMOVE_BY_RANK_RANGE,
    LIST_REMOVE_BY_VALUE,
    LIST_REMOVE_BY_VALUE_RANGE,
    LIST_REMOVE_BY_VALUE_LIST,
    LIST_REMOVE_RANGE,
    LIST_SET,
    LIST_SET_ORDER,
    LIST_SIZE,
    LIST_SORT,
    LIST_TRIM,

    // Map Operation Constants
    MAP_CLEAR,
    MAP_DECREMENT,
    MAP_GET_BY_INDEX,
    MAP_GET_BY_INDEX_RANGE,
    MAP_GET_BY_KEY,
    MAP_GET_BY_KEY_LIST,
    MAP_GET_BY_KEY_RANGE,
    MAP_GET_BY_RANK,
    MAP_GET_BY_RANK_RANGE,
    MAP_GET_BY_VALUE,
    MAP_GET_BY_VALUE_RANGE,
    MAP_GET_BY_VALUE_LIST,
    MAP_INCREMENT,
    MAP_PUT,
    MAP_PUT_ITEMS,
    MAP_REMOVE_BY_INDEX,
    MAP_REMOVE_BY_INDEX_RANGE,
    MAP_REMOVE_BY_KEY,
    MAP_REMOVE_BY_KEY_RANGE,
    MAP_REMOVE_BY_RANK,
    MAP_REMOVE_BY_RANK_RANGE,
    MAP_REMOVE_BY_VALUE,
    MAP_REMOVE_BY_VALUE_RANGE,
    MAP_REMOVE_BY_VALUE_LIST,
    MAP_SET_MAP_POLICY,
    MAP_SIZE
}