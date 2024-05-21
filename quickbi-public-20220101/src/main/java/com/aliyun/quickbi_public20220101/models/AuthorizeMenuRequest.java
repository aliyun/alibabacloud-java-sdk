// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AuthorizeMenuRequest extends TeaModel {
    /**
     * <p>Authorizes the permissions of the menu. Valid values:</p>
     * <br>
     * <p>*   1: view</p>
     * <p>*   3: View + Export (default)</p>
     */
    @NameInMap("AuthPointsValue")
    public Integer authPointsValue;

    /**
     * <p>The ID of the BI portal.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataPortalId")
    public String dataPortalId;

    /**
     * <p>The menu ID of the BI portal leaf node.</p>
     * <br>
     * <p>*   The directory menu cannot be authorized.</p>
     * <p>*   You can upload multiple parameters at a time. Separate multiple IDs with commas (,). The maximum number of parameters that can be modified at a time is 100.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MenuIds")
    public String menuIds;

    /**
     * <p>The IDs of the user groups.</p>
     * <br>
     * <p>*   You can upload multiple parameters at a time. Separate multiple IDs with commas (,). The maximum number of parameters that can be modified at a time is 200.</p>
     * <p>*   UserGroupIds and UserIds cannot be empty at the same time</p>
     */
    @NameInMap("UserGroupIds")
    public String userGroupIds;

    /**
     * <p>The IDs of the end users. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.</p>
     * <br>
     * <p>*   You can upload multiple parameters at a time. Separate multiple IDs with commas (,). The maximum number of parameters that can be modified at a time is 200.</p>
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
