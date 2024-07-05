// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DetachAppPolicyFromIdentityRequest extends TeaModel {
    /**
     * <p>The ID of the application. This parameter is optional if you set PolicyNames to VODAppAdministratorAccess. This parameter is required if you set PolicyNames to a value other than VODAppAdministratorAccess.</p>
     * <ul>
     * <li>Default value: <strong>app-1000000</strong>.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the RAM user or the name of the RAM role.</p>
     * <ul>
     * <li>Specifies the ID of the RAM user for this parameter if you set IdentityType to RamUser.</li>
     * <li>Specifies the name of the RAM role for this parameter if you set IdentityType to RamRole.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test****name</p>
     */
    @NameInMap("IdentityName")
    public String identityName;

    /**
     * <p>The type of the identity. Valid values:</p>
     * <ul>
     * <li><strong>RamUser</strong>: RAM user</li>
     * <li><strong>RamRole</strong>: RAM role</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RamUser</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>The name of the policy. Separate multiple names with commas (,). Only system policies are supported.</p>
     * <ul>
     * <li><strong>VODAppFullAccess</strong>: permissions to manage all resources in an application</li>
     * <li><strong>VODAppReadOnlyAccess</strong>: permissions to read all resources in an application</li>
     * <li><strong>VODAppAdministratorAccess</strong>: permissions of the application administrator</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VODAppFullAccess</p>
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
