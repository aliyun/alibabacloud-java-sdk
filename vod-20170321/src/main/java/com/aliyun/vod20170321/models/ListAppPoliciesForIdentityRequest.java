// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppPoliciesForIdentityRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("IdentityName")
    public String identityName;

    @NameInMap("IdentityType")
    public String identityType;

    public static ListAppPoliciesForIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppPoliciesForIdentityRequest self = new ListAppPoliciesForIdentityRequest();
        return TeaModel.build(map, self);
    }

    public ListAppPoliciesForIdentityRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAppPoliciesForIdentityRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

    public ListAppPoliciesForIdentityRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

}
