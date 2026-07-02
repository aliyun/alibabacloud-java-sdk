// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class TransferUsergroupRequest extends TeaModel {
    /**
     * <p>The ID of the parent user group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asdasva***123124asdasd</p>
     */
    @NameInMap("ParentUserGroupId")
    public String parentUserGroupId;

    /**
     * <p>The ID of the user group to migrate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12qwda****sdada</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static TransferUsergroupRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferUsergroupRequest self = new TransferUsergroupRequest();
        return TeaModel.build(map, self);
    }

    public TransferUsergroupRequest setParentUserGroupId(String parentUserGroupId) {
        this.parentUserGroupId = parentUserGroupId;
        return this;
    }
    public String getParentUserGroupId() {
        return this.parentUserGroupId;
    }

    public TransferUsergroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
