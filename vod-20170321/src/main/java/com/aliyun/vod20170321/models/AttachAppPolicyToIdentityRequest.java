// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AttachAppPolicyToIdentityRequest extends TeaModel {
    /**
     * <p>The application ID. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application</a>.</p>
     * <blockquote>
     * <p>If the policy name is VODAppAdministratorAccess, this parameter is optional. For other policies, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The identity name.</p>
     * <ul>
     * <li>If the type is RamUser, specify the Resource Access Management (RAM) user ID.</li>
     * <li>If the type is RamRole, specify the role name.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("IdentityName")
    public String identityName;

    /**
     * <p>The identity type. Valid values:</p>
     * <ul>
     * <li><strong>RamUser</strong>: Resource Access Management (RAM) user.</li>
     * <li><strong>RamRole</strong>: RAM role.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RamRole</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>The policy names. Separate multiple names with commas (,). Only system policies are supported. Valid values:</p>
     * <ul>
     * <li><strong>VODAppFullAccess</strong>: permissions to manage and operate all resources in the application.</li>
     * <li><strong>VODAppReadOnlyAccess</strong>: read-only permissions on all resources in the application.</li>
     * <li><strong>VODAppAdministratorAccess</strong>: application administrator permissions.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VODAppFullAccess</p>
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
