// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class SetMemberDeletionPermissionRequest extends TeaModel {
    @NameInMap("Status")
    public String status;

    public static SetMemberDeletionPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMemberDeletionPermissionRequest self = new SetMemberDeletionPermissionRequest();
        return TeaModel.build(map, self);
    }

    public SetMemberDeletionPermissionRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
