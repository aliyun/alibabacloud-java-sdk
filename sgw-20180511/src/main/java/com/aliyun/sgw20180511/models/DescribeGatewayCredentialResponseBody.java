// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayCredentialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ConsolePassword")
    public String consolePassword;

    @NameInMap("ConsoleUsername")
    public String consoleUsername;

    @NameInMap("EcsIp")
    public String ecsIp;

    @NameInMap("EcsPassword")
    public String ecsPassword;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeGatewayCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayCredentialResponseBody self = new DescribeGatewayCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayCredentialResponseBody setConsolePassword(String consolePassword) {
        this.consolePassword = consolePassword;
        return this;
    }
    public String getConsolePassword() {
        return this.consolePassword;
    }

    public DescribeGatewayCredentialResponseBody setConsoleUsername(String consoleUsername) {
        this.consoleUsername = consoleUsername;
        return this;
    }
    public String getConsoleUsername() {
        return this.consoleUsername;
    }

    public DescribeGatewayCredentialResponseBody setEcsIp(String ecsIp) {
        this.ecsIp = ecsIp;
        return this;
    }
    public String getEcsIp() {
        return this.ecsIp;
    }

    public DescribeGatewayCredentialResponseBody setEcsPassword(String ecsPassword) {
        this.ecsPassword = ecsPassword;
        return this;
    }
    public String getEcsPassword() {
        return this.ecsPassword;
    }

    public DescribeGatewayCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayCredentialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGatewayCredentialResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeGatewayCredentialResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
