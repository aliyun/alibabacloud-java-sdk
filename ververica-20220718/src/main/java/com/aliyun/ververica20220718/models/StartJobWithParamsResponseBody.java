// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StartJobWithParamsResponseBody extends TeaModel {
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Details of the job instance created from the deployment.</p>
     */
    @NameInMap("data")
    public Job data;

    /**
     * <p>The error code. This field is populated only when <code>success</code> is <code>false</code> and is empty otherwise.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message. This field is populated only when <code>success</code> is <code>false</code> and is empty otherwise.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code. This value is always 200. Use the <code>success</code> field to determine whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static StartJobWithParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartJobWithParamsResponseBody self = new StartJobWithParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public StartJobWithParamsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public StartJobWithParamsResponseBody setData(Job data) {
        this.data = data;
        return this;
    }
    public Job getData() {
        return this.data;
    }

    public StartJobWithParamsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StartJobWithParamsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public StartJobWithParamsResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public StartJobWithParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartJobWithParamsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
