// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CancelAuthorizationMenuRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0d173abb53e84c8ca7495429163b****</p>
     */
    @NameInMap("DataPortalId")
    public String dataPortalId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54kqgoa****,pg1n135****</p>
     */
    @NameInMap("MenuIds")
    public String menuIds;

    /**
     * <strong>example:</strong>
     * <p>34fd141d-4598-4093-8c33-8e066dcb****,3d2c23d4-2b41-4af8-a1f5-f6390f32****</p>
     */
    @NameInMap("UserGroupIds")
    public String userGroupIds;

    /**
     * <strong>example:</strong>
     * <p>204627493484****,121344444790****</p>
     */
    @NameInMap("UserIds")
    public String userIds;

    public static CancelAuthorizationMenuRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAuthorizationMenuRequest self = new CancelAuthorizationMenuRequest();
        return TeaModel.build(map, self);
    }

    public CancelAuthorizationMenuRequest setDataPortalId(String dataPortalId) {
        this.dataPortalId = dataPortalId;
        return this;
    }
    public String getDataPortalId() {
        return this.dataPortalId;
    }

    public CancelAuthorizationMenuRequest setMenuIds(String menuIds) {
        this.menuIds = menuIds;
        return this;
    }
    public String getMenuIds() {
        return this.menuIds;
    }

    public CancelAuthorizationMenuRequest setUserGroupIds(String userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public String getUserGroupIds() {
        return this.userGroupIds;
    }

    public CancelAuthorizationMenuRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

}
