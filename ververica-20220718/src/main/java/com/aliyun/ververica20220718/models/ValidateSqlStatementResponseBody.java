// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ValidateSqlStatementResponseBody extends TeaModel {
    /**
     * <p>The returned data, which represents the details of SQL validation results.</p>
     */
    @NameInMap("data")
    public SqlStatementValidationResult data;

    /**
     * <p>If the value of success was false, an error code was returned. If the value of success was true, a null value was returned.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>If the value of success was false, an error message was returned. If the value of success was true, a null value was returned.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The status code returned. The value was fixed to 200.</p>
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
     * <p>CBC799F0-****-1D30-8A4F-882ED4DD5E02</p>
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

    public static ValidateSqlStatementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateSqlStatementResponseBody self = new ValidateSqlStatementResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateSqlStatementResponseBody setData(SqlStatementValidationResult data) {
        this.data = data;
        return this;
    }
    public SqlStatementValidationResult getData() {
        return this.data;
    }

    public ValidateSqlStatementResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ValidateSqlStatementResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ValidateSqlStatementResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ValidateSqlStatementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateSqlStatementResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
