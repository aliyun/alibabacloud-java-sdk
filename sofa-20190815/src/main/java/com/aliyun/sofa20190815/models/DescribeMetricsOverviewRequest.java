// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeMetricsOverviewRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeMetricsOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricsOverviewRequest self = new DescribeMetricsOverviewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricsOverviewRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
