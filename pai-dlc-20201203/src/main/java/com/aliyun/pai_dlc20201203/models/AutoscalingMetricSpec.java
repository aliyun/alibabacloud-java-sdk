// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class AutoscalingMetricSpec extends TeaModel {
    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("TargetValue")
    public Integer targetValue;

    public static AutoscalingMetricSpec build(java.util.Map<String, ?> map) throws Exception {
        AutoscalingMetricSpec self = new AutoscalingMetricSpec();
        return TeaModel.build(map, self);
    }

    public AutoscalingMetricSpec setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public AutoscalingMetricSpec setTargetValue(Integer targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public Integer getTargetValue() {
        return this.targetValue;
    }

}
