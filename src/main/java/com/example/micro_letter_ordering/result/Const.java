package com.example.micro_letter_ordering.result;

import java.util.Arrays;
import java.util.List;

/**
 * 常量值
 */
public class Const {

    public static final Integer CERTIFICATION_DEFAUlLT =2;//配发审核状态:审核中 //申请类别:小贸

    public static final Integer CERTIFICATION_STATE =1;// 合格证状态 默认状态

    public static final Integer DEFAULT_VALUES = 1 ;//默认值


    public static final Integer RESULT_SUCCESS = 0 ;//成功、  合格证类别:0 配发  合格状态:0 未打印

    public static final Integer RESULT_FAILED = 1 ;//失败





    public static final String CURRENT_USER = "currentUser";
    public static final String CODE = "code";
    public static final String CURRENT_STAFF="currentStaff";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";


    public static final String SPLITE = "#";
    public static final String MODEL_PREFIX = "model//";
    public static final String MODEL_SPILTE = "//";


    //  json  property
    public static final String JSON_CODE_NAME = "error_code";
    public static final String JSON_MSG_NAME = "error_msg";
    public static final String JSON_DATA_NAME = "data";
    public static final String JSON_THING_ID_NAME = "thingId";


    public static final String[] FILED_STR = new String[]{"t_sensor_data_id", "device_id", "location", "device_state", "time"};
    public static final List<String> FILED_LIST = Arrays.asList(FILED_STR);





}
