// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DetachAppPolicyFromIdentityRequest extends TeaModel {
    @NameInMap("IdentityType")
    public String identityType;

    @NameInMap("IdentityName")
    public String identityName;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("PolicyNames")
    public String policyNames;

    public static DetachAppPolicyFromIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachAppPolicyFromIdentityRequest self = new DetachAppPolicyFromIdentityRequest();
        return TeaModel.build(map, self);
    }

    public DetachAppPolicyFromIdentityRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public DetachAppPolicyFromIdentityRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

    public DetachAppPolicyFromIdentityRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DetachAppPolicyFromIdentityRequest setPolicyNames(String policyNames) {
        this.policyNames = policyNames;
        return this;
    }
    public String getPolicyNames() {
        return this.policyNames;
    }

}
