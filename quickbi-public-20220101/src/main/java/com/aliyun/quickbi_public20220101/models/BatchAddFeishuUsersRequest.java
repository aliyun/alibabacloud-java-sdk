// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class BatchAddFeishuUsersRequest extends TeaModel {
    @NameInMap("FeishuUsers")
    public String feishuUsers;

    @NameInMap("IsAdmin")
    public Boolean isAdmin;

    @NameInMap("IsAuthAdmin")
    public Boolean isAuthAdmin;

    @NameInMap("UserGroupIds")
    public String userGroupIds;

    @NameInMap("UserType")
    public Integer userType;

    public static BatchAddFeishuUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddFeishuUsersRequest self = new BatchAddFeishuUsersRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddFeishuUsersRequest setFeishuUsers(String feishuUsers) {
        this.feishuUsers = feishuUsers;
        return this;
    }
    public String getFeishuUsers() {
        return this.feishuUsers;
    }

    public BatchAddFeishuUsersRequest setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public BatchAddFeishuUsersRequest setIsAuthAdmin(Boolean isAuthAdmin) {
        this.isAuthAdmin = isAuthAdmin;
        return this;
    }
    public Boolean getIsAuthAdmin() {
        return this.isAuthAdmin;
    }

    public BatchAddFeishuUsersRequest setUserGroupIds(String userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public String getUserGroupIds() {
        return this.userGroupIds;
    }

    public BatchAddFeishuUsersRequest setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }
    public Integer getUserType() {
        return this.userType;
    }

}
