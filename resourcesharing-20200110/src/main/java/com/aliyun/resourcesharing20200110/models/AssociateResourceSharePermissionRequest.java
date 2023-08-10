// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AssociateResourceSharePermissionRequest extends TeaModel {
    /**
     * <p>The name of the permission.</p>
     */
    @NameInMap("PermissionName")
    public String permissionName;

    /**
     * <p>Specifies whether to use the specified permission to replace an existing permission. Valid values:</p>
     * <br>
     * <p>*   false: does not use the specified permission to replace an existing permission. This is the default value. If you set the value to false for a resource share that does not have associated permissions, the system associates the specified permission with the resource share. In a resource share, one resource type can have only one permission. If you set the value to false for a resource share that already has a permission for the resource type indicated by the specified permission, the system reports an error. This prevents you from replacing the existing permission by mistake.</p>
     * <p>*   true: uses the specified permission to replace an existing permission of the same resource type.</p>
     */
    @NameInMap("Replace")
    public Boolean replace;

    /**
     * <p>The ID of the resource share.</p>
     */
    @NameInMap("ResourceShareId")
    public String resourceShareId;

    public static AssociateResourceSharePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateResourceSharePermissionRequest self = new AssociateResourceSharePermissionRequest();
        return TeaModel.build(map, self);
    }

    public AssociateResourceSharePermissionRequest setPermissionName(String permissionName) {
        this.permissionName = permissionName;
        return this;
    }
    public String getPermissionName() {
        return this.permissionName;
    }

    public AssociateResourceSharePermissionRequest setReplace(Boolean replace) {
        this.replace = replace;
        return this;
    }
    public Boolean getReplace() {
        return this.replace;
    }

    public AssociateResourceSharePermissionRequest setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }
    public String getResourceShareId() {
        return this.resourceShareId;
    }

}
