// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class PushResourceRuleShrinkRequest extends TeaModel {
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

    public static PushResourceRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushResourceRuleShrinkRequest self = new PushResourceRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushResourceRuleShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PushResourceRuleShrinkRequest setMetricInfoShrink(String metricInfoShrink) {
        this.metricInfoShrink = metricInfoShrink;
        return this;
    }
    public String getMetricInfoShrink() {
        return this.metricInfoShrink;
    }

}
