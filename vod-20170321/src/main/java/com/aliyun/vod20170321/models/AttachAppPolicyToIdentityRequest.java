// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AttachAppPolicyToIdentityRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the policy. Only system policies are supported. Separate multiple policies with commas (,). Valid values:</p>
     * <br>
     * <p>*   **VODAppFullAccess**: authorizes an identity to manage all resources in an application.</p>
     * <p>*   **VODAppReadOnlyAccess**: authorizes an identity to access all resources in an application in read-only mode.</p>
     * <p>*   **VODAppAdministratorAccess**: assigns the application administrator role to an identity.</p>
     */
    @NameInMap("IdentityName")
    public String identityName;

    /**
     * <p>The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).</p>
     * <br>
     * <p>> This parameter is optional when the PolicyNames parameter is set to VODAppAdministratorAccess. This parameter is required when the PolicyNames parameter is set to other values.</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>The operation that you want to perform. Set the value to **AttachAppPolicyToIdentity**.</p>
     */
    @NameInMap("PolicyNames")
    public String policyNames;

    public static AttachAppPolicyToIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachAppPolicyToIdentityRequest self = new AttachAppPolicyToIdentityRequest();
        return TeaModel.build(map, self);
    }

    public AttachAppPolicyToIdentityRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AttachAppPolicyToIdentityRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

    public AttachAppPolicyToIdentityRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public AttachAppPolicyToIdentityRequest setPolicyNames(String policyNames) {
        this.policyNames = policyNames;
        return this;
    }
    public String getPolicyNames() {
        return this.policyNames;
    }

}
