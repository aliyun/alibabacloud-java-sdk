// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogFilePaths")
    public String logFilePaths;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayLogsResponseBody self = new DescribeGatewayLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayLogsResponseBody setLogFilePaths(String logFilePaths) {
        this.logFilePaths = logFilePaths;
        return this;
    }
    public String getLogFilePaths() {
        return this.logFilePaths;
    }

    public DescribeGatewayLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
