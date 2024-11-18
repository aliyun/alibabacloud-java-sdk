// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class DisassociateResourceSharePermissionRequest extends TeaModel {
    /**
     * <p>The name of the permission. For more information, see <a href="https://help.aliyun.com/document_detail/465474.html">Permission library</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunRSDefaultPermissionVSwitch</p>
     */
    @NameInMap("PermissionName")
    public String permissionName;

    /**
     * <p>The ID of the resource share.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rs-6GRmdD3X****</p>
     */
    @NameInMap("ResourceShareId")
    public String resourceShareId;

    public static DisassociateResourceSharePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DisassociateResourceSharePermissionRequest self = new DisassociateResourceSharePermissionRequest();
        return TeaModel.build(map, self);
    }

    public DisassociateResourceSharePermissionRequest setPermissionName(String permissionName) {
        this.permissionName = permissionName;
        return this;
    }
    public String getPermissionName() {
        return this.permissionName;
    }

    public DisassociateResourceSharePermissionRequest setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }
    public String getResourceShareId() {
        return this.resourceShareId;
    }

}
