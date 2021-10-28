// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayLogsRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("LogFilePath")
    public String logFilePath;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeGatewayLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayLogsRequest self = new DescribeGatewayLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayLogsRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeGatewayLogsRequest setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
        return this;
    }
    public String getLogFilePath() {
        return this.logFilePath;
    }

    public DescribeGatewayLogsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
