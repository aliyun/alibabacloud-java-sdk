// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DebugResourceRuleShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetricInfo")
    public String metricInfoShrink;

    @NameInMap("RegionId")
    public String regionId;

    public static DebugResourceRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DebugResourceRuleShrinkRequest self = new DebugResourceRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DebugResourceRuleShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DebugResourceRuleShrinkRequest setMetricInfoShrink(String metricInfoShrink) {
        this.metricInfoShrink = metricInfoShrink;
        return this;
    }
    public String getMetricInfoShrink() {
        return this.metricInfoShrink;
    }

    public DebugResourceRuleShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
