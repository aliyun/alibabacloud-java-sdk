// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AuthorizeMenuRequest extends TeaModel {
    @NameInMap("AuthPointsValue")
    public Integer authPointsValue;

    @NameInMap("DataPortalId")
    public String dataPortalId;

    @NameInMap("MenuIds")
    public String menuIds;

    @NameInMap("UserGroupIds")
    public String userGroupIds;

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
