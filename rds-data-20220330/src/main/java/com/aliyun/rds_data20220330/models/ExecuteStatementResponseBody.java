// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class ExecuteStatementResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ExecuteStatementResult data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ExecuteStatementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteStatementResponseBody self = new ExecuteStatementResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteStatementResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecuteStatementResponseBody setData(ExecuteStatementResult data) {
        this.data = data;
        return this;
    }
    public ExecuteStatementResult getData() {
        return this.data;
    }

    public ExecuteStatementResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteStatementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteStatementResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
