// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class RemoveClusterNodeRequest extends TeaModel {
    @NameInMap("ClusterInstanceId")
    public String clusterInstanceId;

    @NameInMap("EcsInstanceIdList")
    public java.util.List<String> ecsInstanceIdList;

    public static RemoveClusterNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveClusterNodeRequest self = new RemoveClusterNodeRequest();
        return TeaModel.build(map, self);
    }

    public RemoveClusterNodeRequest setClusterInstanceId(String clusterInstanceId) {
        this.clusterInstanceId = clusterInstanceId;
        return this;
    }
    public String getClusterInstanceId() {
        return this.clusterInstanceId;
    }

    public RemoveClusterNodeRequest setEcsInstanceIdList(java.util.List<String> ecsInstanceIdList) {
        this.ecsInstanceIdList = ecsInstanceIdList;
        return this;
    }
    public java.util.List<String> getEcsInstanceIdList() {
        return this.ecsInstanceIdList;
    }

}
