// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class SdkValidateStatusRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CredentialType")
    public String credentialType;

    @NameInMap("CredentialValue")
    public String credentialValue;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Token")
    public String token;

    public static SdkValidateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SdkValidateStatusRequest self = new SdkValidateStatusRequest();
        return TeaModel.build(map, self);
    }

    public SdkValidateStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SdkValidateStatusRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public SdkValidateStatusRequest setCredentialValue(String credentialValue) {
        this.credentialValue = credentialValue;
        return this;
    }
    public String getCredentialValue() {
        return this.credentialValue;
    }

    public SdkValidateStatusRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SdkValidateStatusRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
