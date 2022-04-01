// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ReleaseOnEcsClusterParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static ReleaseOnEcsClusterParam build(java.util.Map<String, ?> map) throws Exception {
        ReleaseOnEcsClusterParam self = new ReleaseOnEcsClusterParam();
        return TeaModel.build(map, self);
    }

    public ReleaseOnEcsClusterParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ReleaseOnEcsClusterParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ReleaseOnEcsClusterParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
