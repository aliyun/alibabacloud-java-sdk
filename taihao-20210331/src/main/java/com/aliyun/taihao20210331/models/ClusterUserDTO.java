// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ClusterUserDTO extends TeaModel {
    // password
    @NameInMap("Password")
    public String password;

    // description
    @NameInMap("description")
    public String description;

    // userId
    @NameInMap("userId")
    public String userId;

    // userName
    @NameInMap("userName")
    public String userName;

    // userType
    @NameInMap("userType")
    public String userType;

    public static ClusterUserDTO build(java.util.Map<String, ?> map) throws Exception {
        ClusterUserDTO self = new ClusterUserDTO();
        return TeaModel.build(map, self);
    }

    public ClusterUserDTO setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ClusterUserDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ClusterUserDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ClusterUserDTO setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ClusterUserDTO setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
