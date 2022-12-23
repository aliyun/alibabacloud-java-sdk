// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AttachAppPolicyToIdentityRequest extends TeaModel {
    // The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).
    // > This parameter is optional when the PolicyNames parameter is set to VODAppAdministratorAccess. This parameter is required when the PolicyNames parameter is set to other values.
    @NameInMap("AppId")
    public String appId;

    // The name of the identity.
    // *   Specifies the ID of the RAM user when the IdentityType parameter is set to RamUser.
    // *   Specifies the name of the RAM role when the IdentityType parameter is set to RamRole.
    @NameInMap("IdentityName")
    public String identityName;

    // The type of the identity. Valid values:
    // *   **RamUser**: a RAM user.
    // *   **RamRole**: a RAM role.
    @NameInMap("IdentityType")
    public String identityType;

    // The name of the policy. Only system policies are supported. Separate multiple policies with commas (,). Valid values:
    // *   **VODAppFullAccess**: authorizes an identity to manage all resources in an application.
    // *   **VODAppReadOnlyAccess**: authorizes an identity to access all resources in an application in read-only mode.
    // *   **VODAppAdministratorAccess**: assigns the application administrator role to an identity.
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
