// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppPoliciesForIdentityRequest extends TeaModel {
    /**
     * <p>The application ID. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multiple applications</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The identity name.</p>
     * <ul>
     * <li>If IdentityType is set to RamUser, specify the Resource Access Management (RAM) user ID.</li>
     * <li>If IdentityType is set to RamRole, specify the role name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test****name</p>
     */
    @NameInMap("IdentityName")
    public String identityName;

    /**
     * <p>The identity type. Valid values:</p>
     * <ul>
     * <li><strong>RamUser</strong>: Resource Access Management (RAM) user.</li>
     * <li><strong>RamRole</strong>: RAM role.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RamUser</p>
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
