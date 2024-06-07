// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class PushResourceRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetricInfo")
    public java.util.Map<String, ?> metricInfo;

    public static PushResourceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PushResourceRuleRequest self = new PushResourceRuleRequest();
        return TeaModel.build(map, self);
    }

    public PushResourceRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PushResourceRuleRequest setMetricInfo(java.util.Map<String, ?> metricInfo) {
        this.metricInfo = metricInfo;
        return this;
    }
    public java.util.Map<String, ?> getMetricInfo() {
        return this.metricInfo;
    }

}
