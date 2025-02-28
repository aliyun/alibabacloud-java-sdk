// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateVariableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("accessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("data")
    public Variable data;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <strong>example:</strong>
     * <p>1EF03B0C-F44F-47AD-BB48-D002D0F7B8C9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateVariableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVariableResponseBody self = new UpdateVariableResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVariableResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateVariableResponseBody setData(Variable data) {
        this.data = data;
        return this;
    }
    public Variable getData() {
        return this.data;
    }

    public UpdateVariableResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateVariableResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateVariableResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public UpdateVariableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateVariableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
