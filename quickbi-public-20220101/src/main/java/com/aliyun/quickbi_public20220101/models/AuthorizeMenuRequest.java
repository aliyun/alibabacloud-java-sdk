// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AuthorizeMenuRequest extends TeaModel {
    /**
     * <p>Authorizes the permissions of the menu. Valid values:</p>
     * <ul>
     * <li>1: view</li>
     * <li>3: View + Export (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AuthPointsValue")
    public Integer authPointsValue;

    /**
     * <p>The ID of the BI portal.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0d173abb53e84c8ca7495429163b****</p>
     */
    @NameInMap("DataPortalId")
    public String dataPortalId;

    /**
     * <p>The menu ID of the BI portal leaf node.</p>
     * <ul>
     * <li>The directory menu cannot be authorized.</li>
     * <li>You can upload multiple parameters at a time. Separate multiple IDs with commas (,). The maximum number of parameters that can be modified at a time is 100.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54kqgoa****,pg1n135****</p>
     */
    @NameInMap("MenuIds")
    public String menuIds;

    /**
     * <p>The IDs of the user groups.</p>
     * <ul>
     * <li>You can upload multiple parameters at a time. Separate multiple IDs with commas (,). The maximum number of parameters that can be modified at a time is 200.</li>
     * <li>UserGroupIds and UserIds cannot be empty at the same time</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>34fd141d-4598-4093-8c33-8e066dcb****,3d2c23d4-2b41-4af8-a1f5-f6390f32****</p>
     */
    @NameInMap("UserGroupIds")
    public String userGroupIds;

    /**
     * <p>The IDs of the end users. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.</p>
     * <ul>
     * <li>You can upload multiple parameters at a time. Separate multiple IDs with commas (,). The maximum number of parameters that can be modified at a time is 200.</li>
     * </ul>
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
