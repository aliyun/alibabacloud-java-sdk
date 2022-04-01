// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterUserParam extends TeaModel {
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

    // userType
    @NameInMap("userType")
    public String userType;

    public static UpdateClusterUserParam build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterUserParam self = new UpdateClusterUserParam();
        return TeaModel.build(map, self);
    }

    public UpdateClusterUserParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterUserParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateClusterUserParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public UpdateClusterUserParam setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateClusterUserParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public UpdateClusterUserParam setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateClusterUserParam setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
