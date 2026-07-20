// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteRbacPermissionRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

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
