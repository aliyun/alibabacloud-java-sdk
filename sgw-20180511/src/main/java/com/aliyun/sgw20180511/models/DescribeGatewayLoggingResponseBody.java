// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayLoggingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("GatewayLoggingStatus")
    public String gatewayLoggingStatus;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlsLogstore")
    public String slsLogstore;

    @NameInMap("SlsProject")
    public String slsProject;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayLoggingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayLoggingResponseBody self = new DescribeGatewayLoggingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayLoggingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayLoggingResponseBody setGatewayLoggingStatus(String gatewayLoggingStatus) {
        this.gatewayLoggingStatus = gatewayLoggingStatus;
        return this;
    }
    public String getGatewayLoggingStatus() {
        return this.gatewayLoggingStatus;
    }

    public DescribeGatewayLoggingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayLoggingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayLoggingResponseBody setSlsLogstore(String slsLogstore) {
        this.slsLogstore = slsLogstore;
        return this;
    }
    public String getSlsLogstore() {
        return this.slsLogstore;
    }

    public DescribeGatewayLoggingResponseBody setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

    public DescribeGatewayLoggingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
