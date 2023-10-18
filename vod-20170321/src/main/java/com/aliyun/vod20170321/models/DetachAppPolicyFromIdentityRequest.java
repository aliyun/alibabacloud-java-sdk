// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DetachAppPolicyFromIdentityRequest extends TeaModel {
    /**
     * <p>The ID of the application. This parameter is optional when the PolicyNames parameter is set to VODAppAdministratorAccess. This parameter is required when the PolicyNames parameter is set to other values.</p>
     * <p>*   Default value: **app-1000000**.</p>
     * <p>*   For more information, see [Overview](~~113600~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the identity.</p>
     * <p>*   Specifies the ID of the RAM user when the IdentityType parameter is set to RamUser.</p>
     * <p>*   Specifies the name of the RAM role when the IdentityType parameter is set to RamRole.</p>
     */
    @NameInMap("IdentityName")
    public String identityName;

    /**
     * <p>The type of the identity. Valid values:</p>
     * <p>*   **RamUser**: a RAM user.</p>
     * <p>*   **RamRole**: a RAM role.</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>The name of the policy. Separate multiple policies with commas (,). Only system policies are supported.</p>
     * <p>*   **VODAppFullAccess**: authorizes an identity to manage all resources in an application.</p>
     * <p>*   **VODAppReadOnlyAccess**: authorizes an identity to access all resources in an application in read-only mode.</p>
     * <p>*   **VODAppAdministratorAccess**: assigns the application administrator role to an identity.</p>
     */
    @NameInMap("PolicyNames")
    public String policyNames;

    public static DetachAppPolicyFromIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachAppPolicyFromIdentityRequest self = new DetachAppPolicyFromIdentityRequest();
        return TeaModel.build(map, self);
    }

    public DetachAppPolicyFromIdentityRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DetachAppPolicyFromIdentityRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

    public DetachAppPolicyFromIdentityRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public DetachAppPolicyFromIdentityRequest setPolicyNames(String policyNames) {
        this.policyNames = policyNames;
        return this;
    }
    public String getPolicyNames() {
        return this.policyNames;
    }

}
