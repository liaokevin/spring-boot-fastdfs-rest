package com.enjoysoft.fastdfsboot.domain;

/**
 * Created by kevin on 2016/12/25.
 */
public class RestErrorBean {
    public final String detail;
    public final String message;

    public RestErrorBean(Exception ex, String detail) {
        this.message = ex.getLocalizedMessage();
        this.detail = detail;
    }



}
