// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetNodeMetricsResponseBody extends TeaModel {
    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("NodesMetrics")
    public java.util.List<NodeMetric> nodesMetrics;

    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    public static GetNodeMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeMetricsResponseBody self = new GetNodeMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeMetricsResponseBody setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public GetNodeMetricsResponseBody setNodesMetrics(java.util.List<NodeMetric> nodesMetrics) {
        this.nodesMetrics = nodesMetrics;
        return this;
    }
    public java.util.List<NodeMetric> getNodesMetrics() {
        return this.nodesMetrics;
    }

    public GetNodeMetricsResponseBody setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

}
