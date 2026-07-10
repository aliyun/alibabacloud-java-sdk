// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StartSqlExecutionResponseBody extends TeaModel {
    /**
     * <p>The complete information of the SQL script returned upon success. This parameter is valid when success is true.</p>
     * 
     * <strong>example:</strong>
     * <p>如返回示例所示</p>
     */
    @NameInMap("data")
    public StartSqlExecutionResult data;

    /**
     * <p>The business error code. This parameter is not empty when success is false. This parameter is empty when success is true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The business error message. This parameter is not empty when success is false. This parameter is empty when success is true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The business status code, which is always 200. Use success to determine whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the business request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static StartSqlExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartSqlExecutionResponseBody self = new StartSqlExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartSqlExecutionResponseBody setData(StartSqlExecutionResult data) {
        this.data = data;
        return this;
    }
    public StartSqlExecutionResult getData() {
        return this.data;
    }

    public StartSqlExecutionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StartSqlExecutionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public StartSqlExecutionResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public StartSqlExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartSqlExecutionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
