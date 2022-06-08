// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class ValidateStatusRequest extends TeaModel {
    // 阿里UID
    @NameInMap("AliUid")
    public Long aliUid;

    // 应用名称
    @NameInMap("AppId")
    public String appId;

    // 凭证类型
    @NameInMap("CredentialType")
    public String credentialType;

    // mobile=150xxxx4661
    @NameInMap("CredentialValue")
    public String credentialValue;

    // 取值包括cm（中国移动）/ct（中国电信）/cu（中国联通）
    @NameInMap("Operator")
    public String operator;

    public static ValidateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateStatusRequest self = new ValidateStatusRequest();
        return TeaModel.build(map, self);
    }

    public ValidateStatusRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public ValidateStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ValidateStatusRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public ValidateStatusRequest setCredentialValue(String credentialValue) {
        this.credentialValue = credentialValue;
        return this;
    }
    public String getCredentialValue() {
        return this.credentialValue;
    }

    public ValidateStatusRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
