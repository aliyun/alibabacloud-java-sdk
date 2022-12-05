// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AssociateResourceSharePermissionRequest extends TeaModel {
    @NameInMap("PermissionName")
    public String permissionName;

    @NameInMap("Replace")
    public Boolean replace;

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
