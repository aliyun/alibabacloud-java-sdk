// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SqlStatementValidationResult extends TeaModel {
    @NameInMap("errorDetails")
    public ErrorDetails errorDetails;

    @NameInMap("message")
    public String message;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("validationResult")
    public String validationResult;

    public static SqlStatementValidationResult build(java.util.Map<String, ?> map) throws Exception {
        SqlStatementValidationResult self = new SqlStatementValidationResult();
        return TeaModel.build(map, self);
    }

    public SqlStatementValidationResult setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }
    public ErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    public SqlStatementValidationResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SqlStatementValidationResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SqlStatementValidationResult setValidationResult(String validationResult) {
        this.validationResult = validationResult;
        return this;
    }
    public String getValidationResult() {
        return this.validationResult;
    }

}
