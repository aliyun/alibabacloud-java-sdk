// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AuthorizeMenuRequest extends TeaModel {
    /**
     * <p>The permissions to grant for the menus. Valid values:</p>
     * <ul>
     * <li>1: View.</li>
     * <li>3: View and export. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AuthPointsValue")
    public Integer authPointsValue;

    /**
     * <p>The ID of the data portal.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0d173abb53e84c8ca7495429163b****</p>
     */
    @NameInMap("DataPortalId")
    public String dataPortalId;

    /**
     * <p>The IDs of the leaf node menus in the data portal. You can specify multiple IDs. Separate multiple IDs with commas (,). You can specify up to 100 IDs at a time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54kqgoa****,pg1n135****</p>
     */
    @NameInMap("MenuIds")
    public String menuIds;

    /**
     * <p>The IDs of the user groups. You can specify multiple IDs. Separate multiple IDs with commas (,). You can specify up to 200 IDs at a time. You must specify at least one of UserGroupIds and UserIds.</p>
     * 
     * <strong>example:</strong>
     * <p>34fd141d-4598-4093-8c33-8e066dcb****,3d2c23d4-2b41-4af8-a1f5-f6390f32****</p>
     */
    @NameInMap("UserGroupIds")
    public String userGroupIds;

    /**
     * <p>The IDs of the users. These are Quick BI user IDs, not Alibaba Cloud UIDs. You can specify multiple IDs. Separate multiple IDs with commas (,). You can specify up to 200 IDs at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>204627493484****,121344444790****</p>
     */
    @NameInMap("UserIds")
    public String userIds;

    public static AuthorizeMenuRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeMenuRequest self = new AuthorizeMenuRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeMenuRequest setAuthPointsValue(Integer authPointsValue) {
        this.authPointsValue = authPointsValue;
        return this;
    }
    public Integer getAuthPointsValue() {
        return this.authPointsValue;
    }

    public AuthorizeMenuRequest setDataPortalId(String dataPortalId) {
        this.dataPortalId = dataPortalId;
        return this;
    }
    public String getDataPortalId() {
        return this.dataPortalId;
    }

    public AuthorizeMenuRequest setMenuIds(String menuIds) {
        this.menuIds = menuIds;
        return this;
    }
    public String getMenuIds() {
        return this.menuIds;
    }

    public AuthorizeMenuRequest setUserGroupIds(String userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public String getUserGroupIds() {
        return this.userGroupIds;
    }

    public AuthorizeMenuRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

}
