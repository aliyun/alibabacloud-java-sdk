// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingMetricsRequest extends TeaModel {
    // listAutoScalingMetricsParam
    @NameInMap("listAutoScalingMetricsParam")
    public ListAutoScalingMetricsParam listAutoScalingMetricsParam;

    public static ListAutoScalingMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingMetricsRequest self = new ListAutoScalingMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingMetricsRequest setListAutoScalingMetricsParam(ListAutoScalingMetricsParam listAutoScalingMetricsParam) {
        this.listAutoScalingMetricsParam = listAutoScalingMetricsParam;
        return this;
    }
    public ListAutoScalingMetricsParam getListAutoScalingMetricsParam() {
        return this.listAutoScalingMetricsParam;
    }

}
