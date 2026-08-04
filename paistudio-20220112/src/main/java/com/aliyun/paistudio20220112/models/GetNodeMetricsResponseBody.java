// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetNodeMetricsResponseBody extends TeaModel {
    /**
     * <p>The name of the metric to query.</p>
     * 
     * <strong>example:</strong>
     * <p>DiskWriteRate</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The metric information of the nodes.</p>
     */
    @NameInMap("NodesMetrics")
    public java.util.List<NodeMetric> nodesMetrics;

    /**
     * <p>The resource group ID. Each resource group has a globally unique resource group ID. You can use the resource group ID to obtain information about the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rgf0zhfqn1d4ity2</p>
     */
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
