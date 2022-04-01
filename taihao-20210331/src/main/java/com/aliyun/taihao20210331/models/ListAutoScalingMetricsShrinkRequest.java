// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingMetricsShrinkRequest extends TeaModel {
    // listAutoScalingMetricsParam
    @NameInMap("listAutoScalingMetricsParam")
    public String listAutoScalingMetricsParamShrink;

    public static ListAutoScalingMetricsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingMetricsShrinkRequest self = new ListAutoScalingMetricsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingMetricsShrinkRequest setListAutoScalingMetricsParamShrink(String listAutoScalingMetricsParamShrink) {
        this.listAutoScalingMetricsParamShrink = listAutoScalingMetricsParamShrink;
        return this;
    }
    public String getListAutoScalingMetricsParamShrink() {
        return this.listAutoScalingMetricsParamShrink;
    }

}
