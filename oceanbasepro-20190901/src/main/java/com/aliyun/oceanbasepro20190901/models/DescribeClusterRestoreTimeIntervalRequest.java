// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeClusterRestoreTimeIntervalRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeClusterRestoreTimeIntervalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterRestoreTimeIntervalRequest self = new DescribeClusterRestoreTimeIntervalRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterRestoreTimeIntervalRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
