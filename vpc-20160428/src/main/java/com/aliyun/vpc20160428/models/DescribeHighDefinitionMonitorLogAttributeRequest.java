// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeHighDefinitionMonitorLogAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    public static DescribeHighDefinitionMonitorLogAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighDefinitionMonitorLogAttributeRequest self = new DescribeHighDefinitionMonitorLogAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHighDefinitionMonitorLogAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHighDefinitionMonitorLogAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHighDefinitionMonitorLogAttributeRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
