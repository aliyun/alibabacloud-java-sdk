// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    @NameInMap("AdminUser")
    public Boolean adminUser;

    @NameInMap("AuthAdminUser")
    public Boolean authAdminUser;

    @NameInMap("NickName")
    public String nickName;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserType")
    public Integer userType;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setAdminUser(Boolean adminUser) {
        this.adminUser = adminUser;
        return this;
    }
    public Boolean getAdminUser() {
        return this.adminUser;
    }

    public UpdateUserRequest setAuthAdminUser(Boolean authAdminUser) {
        this.authAdminUser = authAdminUser;
        return this;
    }
    public Boolean getAuthAdminUser() {
        return this.authAdminUser;
    }

    public UpdateUserRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public UpdateUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateUserRequest setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }
    public Integer getUserType() {
        return this.userType;
    }

}
