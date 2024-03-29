// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GrantUserPermissionsRequest extends TeaModel {
    /**
     * <p>The permissions that are granted to an entity. The content is a string that consists of JSON arrays. You must specify all permissions that you want to grant to an entity. You can add or remove permissions by modifying the content. Field definition of the sample code:</p>
     * <br>
     * <p>*   `IsCustom`: a parameter that is required by the system. Set the value to `true`.</p>
     * <p>*   `Cluster`: the ID of the Service Mesh (ASM) instance.</p>
     * <p>*   `RoleName`: the name of the permissions. Valid values: `istio-admin`, `istio-ops`, and `istio-readonly`. A value of istio-admin indicates the permissions of ASM administrators. A value of istio-ops indicates the permissions of ASM restricted users. A value of istio-readonly indicates the read-only permissions.</p>
     * <p>*   `IsRamRole`: the entity to which you want to grant the permissions. To grant the permissions to a RAM role, set the value to `true`. Otherwise, set the value to `false`.</p>
     */
    @NameInMap("Permissions")
    public String permissions;

    /**
     * <p>The ID of the RAM user or RAM role.</p>
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
