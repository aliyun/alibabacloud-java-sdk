// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AttachAppPolicyToIdentityRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application service</a>.</p>
     * <blockquote>
     * <p>This parameter is optional only if you set the policy name to VODAppAdministratorAccess.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the RAM user or the name of the RAM role.</p>
     * <ul>
     * <li>Specify the ID of the RAM user when the IdentityType parameter is set to RamUser.</li>
     * <li>Specify the name of the RAM role when the IdentityType parameter is set to RamRole.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("IdentityName")
    public String identityName;

    /**
     * <p>The type of the identity. Valid values:</p>
     * <ul>
     * <li><strong>RamUser</strong>: a RAM user</li>
     * <li><strong>RamRole</strong>: a RAM role</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RamRole</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>The name of the policy. Only system policies are supported. Separate multiple policy names with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>VODAppFullAccess</strong>: permissions to manage all resources in an application.</li>
     * <li><strong>VODAppReadOnlyAccess</strong>: permissions to read all resources in an application.</li>
     * <li><strong>VODAppAdministratorAccess</strong>: permissions of the application administrator.</li>
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
