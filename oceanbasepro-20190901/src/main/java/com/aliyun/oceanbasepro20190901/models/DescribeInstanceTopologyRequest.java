// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTopologyRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeInstanceTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTopologyRequest self = new DescribeInstanceTopologyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTopologyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
