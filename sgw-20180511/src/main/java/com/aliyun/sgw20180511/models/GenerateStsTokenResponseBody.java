// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class GenerateStsTokenResponseBody extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("AccessKeySecret")
    public String accessKeySecret;

    @NameInMap("Code")
    public String code;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("Expiration")
    public String expiration;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SupportBundleTarget")
    public String supportBundleTarget;

    public static GenerateStsTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateStsTokenResponseBody self = new GenerateStsTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateStsTokenResponseBody setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public GenerateStsTokenResponseBody setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public GenerateStsTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateStsTokenResponseBody setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public GenerateStsTokenResponseBody setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public GenerateStsTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateStsTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateStsTokenResponseBody setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GenerateStsTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GenerateStsTokenResponseBody setSupportBundleTarget(String supportBundleTarget) {
        this.supportBundleTarget = supportBundleTarget;
        return this;
    }
    public String getSupportBundleTarget() {
        return this.supportBundleTarget;
    }

}
