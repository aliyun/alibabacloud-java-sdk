// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InvokeId")
    public String invokeId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeInvocationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationResultRequest self = new DescribeInvocationResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInvocationResultRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public DescribeInvocationResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
