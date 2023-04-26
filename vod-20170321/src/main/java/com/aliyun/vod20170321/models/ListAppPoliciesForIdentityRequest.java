// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppPoliciesForIdentityRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The type of the identity. Valid values:</p>
     * <br>
     * <p>*   **RamUser**: a RAM user.</p>
     * <p>*   **RamRole**: a RAM role.</p>
     */
    @NameInMap("IdentityName")
    public String identityName;

    /**
     * <p>The type of the policy. Valid values:</p>
     * <br>
     * <p>*   **System**</p>
     * <p>*   **Custom**</p>
     */
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
