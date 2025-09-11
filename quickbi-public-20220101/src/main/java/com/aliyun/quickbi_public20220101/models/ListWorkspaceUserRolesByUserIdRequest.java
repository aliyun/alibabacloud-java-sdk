// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListWorkspaceUserRolesByUserIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>afas-********asfasg</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListWorkspaceUserRolesByUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceUserRolesByUserIdRequest self = new ListWorkspaceUserRolesByUserIdRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceUserRolesByUserIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
