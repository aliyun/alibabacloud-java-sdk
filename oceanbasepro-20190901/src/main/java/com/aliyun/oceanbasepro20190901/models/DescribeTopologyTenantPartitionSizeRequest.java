// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTopologyTenantPartitionSizeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeTopologyTenantPartitionSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopologyTenantPartitionSizeRequest self = new DescribeTopologyTenantPartitionSizeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTopologyTenantPartitionSizeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
