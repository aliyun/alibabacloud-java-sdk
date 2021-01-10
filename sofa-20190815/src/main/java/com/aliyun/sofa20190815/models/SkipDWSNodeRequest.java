// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SkipDWSNodeRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public Long nodeId;

    public static SkipDWSNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipDWSNodeRequest self = new SkipDWSNodeRequest();
        return TeaModel.build(map, self);
    }

    public SkipDWSNodeRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public SkipDWSNodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SkipDWSNodeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

}
