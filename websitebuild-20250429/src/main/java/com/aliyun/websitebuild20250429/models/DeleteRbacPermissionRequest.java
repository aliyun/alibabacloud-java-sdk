// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteRbacPermissionRequest extends TeaModel {
    /**
     * <p>The business instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250814102215000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The permission ID.</p>
     * 
     * <strong>example:</strong>
     * <p>804a6b2a-82ac-49f2-960a-a6c2ed9e73dd</p>
     */
    @NameInMap("PermissionId")
    public String permissionId;

    public static DeleteRbacPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRbacPermissionRequest self = new DeleteRbacPermissionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRbacPermissionRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DeleteRbacPermissionRequest setPermissionId(String permissionId) {
        this.permissionId = permissionId;
        return this;
    }
    public String getPermissionId() {
        return this.permissionId;
    }

}
