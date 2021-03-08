// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AttachAppPolicyToIdentityRequest extends TeaModel {
    @NameInMap("IdentityType")
    public String identityType;

    @NameInMap("IdentityName")
    public String identityName;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("PolicyNames")
    public String policyNames;

    @NameInMap("ResourceRealOwnerId")
    public String resourceRealOwnerId;

    public static AttachAppPolicyToIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachAppPolicyToIdentityRequest self = new AttachAppPolicyToIdentityRequest();
        return TeaModel.build(map, self);
    }

    public AttachAppPolicyToIdentityRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public AttachAppPolicyToIdentityRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

    public AttachAppPolicyToIdentityRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AttachAppPolicyToIdentityRequest setPolicyNames(String policyNames) {
        this.policyNames = policyNames;
        return this;
    }
    public String getPolicyNames() {
        return this.policyNames;
    }

    public AttachAppPolicyToIdentityRequest setResourceRealOwnerId(String resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public String getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

}
