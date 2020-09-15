package com.gbase.jdbctest.util;

public enum ErrorCode {

    /**
     * 通用成功
     */
    SUCCESS("2000", "操作成功"),

    /**
     * 通用失败
     */
    FAILED("2001", "操作失败"),

    /**
     * 无记录
     */
    NO_RECORD("2002", "无记录"),

    /**
     * 存在相同顺序记录，不能添加
     */
    CANNOT_INSERT_PACKAGE_TYPE("2003", "存在相同顺序记录"),

    /**
     * 关联其他记录，不能删除
     */
    CANNOT_MODIFY("2004", "关联其他记录，不能删除"),

    /**
     * 存在相同记录
     */
    CANNOT_INSERT("2005", "存在相同记录!"),

    /**
     * 存在未付费数据
     */
    EXIST_UNPAID_DATA("2006", "存在未付费数据，不可删除"),

    /**
     * 参数错误
     */
    PARAM_ERROR("3001", "参数错误"),


    /**
     * 网址输入错误
     */
    URL_ERROR("3002", "请输入正确的网址"),

    /**
     * OPEN API 错误码
     */
    APP_KEY_ERROR("4001", "APP key验证失败"),

    HTTP_URL_ERROR("4002", "长网址格式错误"),

    SURL_KEY_ERROR("4003", "surlKey错误"),

    TERM_VALIDITY_ERROR("4004", "有效期参数错误"),

    NO_LONG_URL_RECORD("4005", "无长网址记录");

    private String code;

    private String name;

    ErrorCode(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static String getName(String code) {
        String ret = null;
        for (ErrorCode temp : ErrorCode.values()) {
            if (code.equals(temp.getCode())) {
                ret = temp.getName();
                break;
            }
        }
        return ret;
    }
}
