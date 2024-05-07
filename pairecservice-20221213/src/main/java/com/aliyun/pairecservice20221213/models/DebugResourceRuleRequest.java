// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DebugResourceRuleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MetricInfo")
    public java.util.Map<String, ?> metricInfo;

    @NameInMap("RegionId")
    public String regionId;

    public static DebugResourceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DebugResourceRuleRequest self = new DebugResourceRuleRequest();
        return TeaModel.build(map, self);
    }

    public DebugResourceRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DebugResourceRuleRequest setMetricInfo(java.util.Map<String, ?> metricInfo) {
        this.metricInfo = metricInfo;
        return this;
    }
    public java.util.Map<String, ?> getMetricInfo() {
        return this.metricInfo;
    }

    public DebugResourceRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
