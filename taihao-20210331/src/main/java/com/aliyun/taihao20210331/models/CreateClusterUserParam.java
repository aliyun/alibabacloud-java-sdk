// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateClusterUserParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // description
    @NameInMap("description")
    public String description;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // password
    @NameInMap("password")
    public String password;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // userId
    @NameInMap("userId")
    public String userId;

    // userId
    @NameInMap("userName")
    public String userName;

    // userType
    @NameInMap("userType")
    public String userType;

    public static CreateClusterUserParam build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterUserParam self = new CreateClusterUserParam();
        return TeaModel.build(map, self);
    }

    public CreateClusterUserParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateClusterUserParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateClusterUserParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public CreateClusterUserParam setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateClusterUserParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public CreateClusterUserParam setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateClusterUserParam setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateClusterUserParam setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
