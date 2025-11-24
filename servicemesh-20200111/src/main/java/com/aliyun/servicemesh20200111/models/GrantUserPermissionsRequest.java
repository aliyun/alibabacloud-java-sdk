// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GrantUserPermissionsRequest extends TeaModel {
    /**
     * <p>The permissions that are granted to an entity. The content is a string that consists of JSON arrays. You must specify all permissions that you want to grant to an entity. You can add or remove permissions by modifying the content. Field definition of the sample code:</p>
     * <ul>
     * <li><code>IsCustom</code>: a parameter that is required by the system. Set the value to <code>true</code>.</li>
     * <li><code>Cluster</code>: the ID of the Service Mesh (ASM) instance.</li>
     * <li><code>RoleName</code>: the name of the permissions. Valid values: <code>istio-admin</code>, <code>istio-ops</code>, and <code>istio-readonly</code>. A value of istio-admin indicates the permissions of ASM administrators. A value of istio-ops indicates the permissions of ASM restricted users. A value of istio-readonly indicates the read-only permissions.</li>
     * <li><code>IsRamRole</code>: the entity to which you want to grant the permissions. To grant the permissions to a RAM role, set the value to <code>true</code>. Otherwise, set the value to <code>false</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;IsCustom&quot;:true,&quot;RoleName&quot;:&quot;istio-ops&quot;,&quot;Cluster&quot;:&quot;c57b848115458460583a4260cb713****&quot;,&quot;RoleType&quot;:&quot;custom&quot;,&quot;IsRamRole&quot;:false},{&quot;IsCustom&quot;:true,&quot;RoleName&quot;:&quot;istio-ops&quot;,&quot;Cluster&quot;:&quot;c4ec191f4e12145c09286ea3e2b8f****&quot;,&quot;RoleType&quot;:&quot;custom&quot;,&quot;IsRamRole&quot;:false}]</p>
     */
    @NameInMap("Permissions")
    public String permissions;

    /**
     * <p>The ID of the RAM user or RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>27852573609480****</p>
     */
    @NameInMap("SubAccountUserId")
    public String subAccountUserId;

    /**
     * <p>The IDs of RAM users or RAM roles. You can grant permissions to multiple users at a time.</p>
     */
    @NameInMap("SubAccountUserIds")
    public java.util.List<String> subAccountUserIds;

    public static GrantUserPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantUserPermissionsRequest self = new GrantUserPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public GrantUserPermissionsRequest setPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }
    public String getPermissions() {
        return this.permissions;
    }

    public GrantUserPermissionsRequest setSubAccountUserId(String subAccountUserId) {
        this.subAccountUserId = subAccountUserId;
        return this;
    }
    public String getSubAccountUserId() {
        return this.subAccountUserId;
    }

    public GrantUserPermissionsRequest setSubAccountUserIds(java.util.List<String> subAccountUserIds) {
        this.subAccountUserIds = subAccountUserIds;
        return this;
    }
    public java.util.List<String> getSubAccountUserIds() {
        return this.subAccountUserIds;
    }

}
