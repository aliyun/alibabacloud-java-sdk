// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AttachAppPolicyToIdentityRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: **app-1000000**. For more information, see [Multi-application service](~~113600~~).</p>
     * <br>
     * <p>> This parameter is optional only if you set the policy name to VODAppAdministratorAccess.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the RAM user or the name of the RAM role.</p>
     * <br>
     * <p>*   Specify the ID of the RAM user when the IdentityType parameter is set to RamUser.</p>
     * <p>*   Specify the name of the RAM role when the IdentityType parameter is set to RamRole.</p>
     */
    @NameInMap("IdentityName")
    public String identityName;

    /**
     * <p>The type of the identity. Valid values:</p>
     * <br>
     * <p>*   **RamUser**: a RAM user</p>
     * <p>*   **RamRole**: a RAM role</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>The name of the policy. Only system policies are supported. Separate multiple policy names with commas (,). Valid values:</p>
     * <br>
     * <p>*   **VODAppFullAccess**: permissions to manage all resources in an application.</p>
     * <p>*   **VODAppReadOnlyAccess**: permissions to read all resources in an application.</p>
     * <p>*   **VODAppAdministratorAccess**: permissions of the application administrator.</p>
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
