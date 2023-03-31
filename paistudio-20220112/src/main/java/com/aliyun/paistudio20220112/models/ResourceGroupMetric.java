// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ResourceGroupMetric extends TeaModel {
    @NameInMap("GpuType")
    public String gpuType;

    @NameInMap("Metrics")
    public java.util.List<Metric> metrics;

    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    public static ResourceGroupMetric build(java.util.Map<String, ?> map) throws Exception {
        ResourceGroupMetric self = new ResourceGroupMetric();
        return TeaModel.build(map, self);
    }

    public ResourceGroupMetric setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }
    public String getGpuType() {
        return this.gpuType;
    }

    public ResourceGroupMetric setMetrics(java.util.List<Metric> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<Metric> getMetrics() {
        return this.metrics;
    }

    public ResourceGroupMetric setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

}
