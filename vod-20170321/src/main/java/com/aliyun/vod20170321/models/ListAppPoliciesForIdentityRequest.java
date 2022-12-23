// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppPoliciesForIdentityRequest extends TeaModel {
    // The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).
    @NameInMap("AppId")
    public String appId;

    // The name of the identity.
    // 
    // *   Specifies the ID of the RAM user when the IdentityType parameter is set to RamUser.
    // *   Specifies the name of the RAM role when the IdentityType parameter is set to RamRole.
    @NameInMap("IdentityName")
    public String identityName;

    // The type of the identity. Valid values:
    // 
    // *   **RamUser**: a RAM user.
    // *   **RamRole**: a RAM role.
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
