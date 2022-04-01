// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterScriptDetailParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // clusterScriptId
    @NameInMap("clusterScriptId")
    public String clusterScriptId;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static GetClusterScriptDetailParam build(java.util.Map<String, ?> map) throws Exception {
        GetClusterScriptDetailParam self = new GetClusterScriptDetailParam();
        return TeaModel.build(map, self);
    }

    public GetClusterScriptDetailParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetClusterScriptDetailParam setClusterScriptId(String clusterScriptId) {
        this.clusterScriptId = clusterScriptId;
        return this;
    }
    public String getClusterScriptId() {
        return this.clusterScriptId;
    }

    public GetClusterScriptDetailParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public GetClusterScriptDetailParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
