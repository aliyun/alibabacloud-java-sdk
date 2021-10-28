// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayAuthInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Password")
    public String password;

    @NameInMap("PublicIp")
    public String publicIp;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Username")
    public String username;

    public static DescribeGatewayAuthInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayAuthInfoResponseBody self = new DescribeGatewayAuthInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayAuthInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayAuthInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayAuthInfoResponseBody setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public DescribeGatewayAuthInfoResponseBody setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public DescribeGatewayAuthInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayAuthInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGatewayAuthInfoResponseBody setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
