// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class GetPermissionRequest extends TeaModel {
    /**
     * <p>The name of the permission.</p>
     */
    @NameInMap("PermissionName")
    public String permissionName;

    /**
     * <p>The version of the permission.</p>
     */
    @NameInMap("PermissionVersion")
    public String permissionVersion;

    public static GetPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionRequest self = new GetPermissionRequest();
        return TeaModel.build(map, self);
    }

    public GetPermissionRequest setPermissionName(String permissionName) {
        this.permissionName = permissionName;
        return this;
    }
    public String getPermissionName() {
        return this.permissionName;
    }

    public GetPermissionRequest setPermissionVersion(String permissionVersion) {
        this.permissionVersion = permissionVersion;
        return this;
    }
    public String getPermissionVersion() {
        return this.permissionVersion;
    }

}
