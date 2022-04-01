// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterAttributeParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // clusterName
    @NameInMap("clusterName")
    public String clusterName;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // token
    @NameInMap("token")
    public String token;

    public static UpdateClusterAttributeParam build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterAttributeParam self = new UpdateClusterAttributeParam();
        return TeaModel.build(map, self);
    }

    public UpdateClusterAttributeParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterAttributeParam setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateClusterAttributeParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public UpdateClusterAttributeParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public UpdateClusterAttributeParam setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
