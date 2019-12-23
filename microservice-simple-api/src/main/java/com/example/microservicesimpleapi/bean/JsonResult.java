package com.example.microservicesimpleapi.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class JsonResult<T> implements Serializable {

    private String code;
    private T result;
    private String message;
    private boolean success = true;

    public static final String ERROR = "999999";
    public static final String SUCCESS = "0";

    public JsonResult() {
    }

    public JsonResult(String code, T result, String message, boolean success) {
        this.code = code;
        this.result = result;
        this.message = message;
        this.success = success;
    }

    public static final String COMMON_ERROR_CODE = "100000";

    public static final String DATA_NOT_EXIT_CODE = "100001";
    public static JsonResult DATA_NOT_EXIT = new JsonResult(DATA_NOT_EXIT_CODE, null, "数据不存在", false);

    public static final String DATA_EXIT_CODE = "100002";
    public static JsonResult DATA_EXIT = new JsonResult(DATA_EXIT_CODE, null, "数据已经存在", false);

    public static final String FORMAT_ERROR_CODE = "100003";
    public static JsonResult FORMAT_ERROR = new JsonResult(FORMAT_ERROR_CODE, null, "数据格式错误", false);

    public static final String ADD_ERROR_CODE = "100004";
    public static JsonResult ADD_ERROR = new JsonResult(ADD_ERROR_CODE, null, "新增失败", false);

    public static final String UPDATE_ERROR_CODE = "100005";
    public static JsonResult UPDATE_ERROR = new JsonResult(UPDATE_ERROR_CODE, null, "修改失败", false);

    public static final String DELETE_ERROR_CODE = "999996";
    public static JsonResult DELETE_ERROR = new JsonResult(DELETE_ERROR_CODE, null, "删除失败", false);

    public static final String ID_EXIST_CODE = "100006";
    public static JsonResult ID_EXIST_CODE_ERROR = new JsonResult(ID_EXIST_CODE, null, "证件号已经存在", false);

    public static final String ID_FORMAT_CODE = "100007";
    public static JsonResult ID_FORMAT_ERROR = new JsonResult(ID_FORMAT_CODE, null, "证件号格式错误", false);

    public static final String FILE_TYPE_ERROR_CODE = "100008";
    public static JsonResult FILE_TYPE_ERROR = new JsonResult(FILE_TYPE_ERROR_CODE, null, "文件格式错误", false);

    public static final String FILE_EMPTY_ERROR_CODE = "100009";
    public static JsonResult FILE_EMPTY_ERROR = new JsonResult(FILE_EMPTY_ERROR_CODE, null, "文件内容为空", false);

    public static final String AUTH_ERROR_CODE = "999998";
    public static JsonResult AUTH_ERROR = new JsonResult(AUTH_ERROR_CODE, null, "身份验证失败", false);

    public static final String API_ERROR_CODE = "999999";
    public static JsonResult API_ERROR = new JsonResult(API_ERROR_CODE, null, "api未知异常", false);

    public static final String IMAGE_UPLOAD_FAILED_CODE="999997";
    public static JsonResult IMAGE_UPLOAD_FAILED = new JsonResult(IMAGE_UPLOAD_FAILED_CODE, null, "图片上传失败", false);

    public static JsonResult SUCCESS(Object data) {
        return new JsonResult(JsonResult.SUCCESS, data, "SUCCESS", true);
    }

    public static JsonResult ERROR(String code, String message) {
        return new JsonResult(code, null, message, false);
    }
    public static JsonResult COMMON_ERROR( String message) {
        return new JsonResult(COMMON_ERROR_CODE, null, message, false);
    }
}
