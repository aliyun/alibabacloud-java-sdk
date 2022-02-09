// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRestorableTenantsRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeRestorableTenantsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestorableTenantsRequest self = new DescribeRestorableTenantsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRestorableTenantsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
