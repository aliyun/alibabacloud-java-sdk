// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopologyNodesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeTopologyNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopologyNodesRequest self = new DescribeTopologyNodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTopologyNodesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
