// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayADInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("IsEnabled")
    public Boolean isEnabled;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerIp")
    public String serverIp;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Username")
    public String username;

    public static DescribeGatewayADInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayADInfoResponseBody self = new DescribeGatewayADInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayADInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayADInfoResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeGatewayADInfoResponseBody setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public DescribeGatewayADInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayADInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayADInfoResponseBody setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

    public DescribeGatewayADInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGatewayADInfoResponseBody setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
