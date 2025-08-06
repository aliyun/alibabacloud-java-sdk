// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayMetricAuthResponseBody extends TeaModel {
    @NameInMap("MetricList")
    public java.util.List<String> metricList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePlayMetricAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayMetricAuthResponseBody self = new DescribePlayMetricAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlayMetricAuthResponseBody setMetricList(java.util.List<String> metricList) {
        this.metricList = metricList;
        return this;
    }
    public java.util.List<String> getMetricList() {
        return this.metricList;
    }

    public DescribePlayMetricAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
