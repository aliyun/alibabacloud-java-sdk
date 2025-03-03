// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SetMemberDeletionPermissionRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the member deletion feature. Valid values:</p>
     * <ul>
     * <li>Enabled: enables the member deletion feature</li>
     * <li>Disabled: disables the member deletion feature</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
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
