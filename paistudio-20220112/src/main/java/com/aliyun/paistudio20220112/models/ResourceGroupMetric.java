// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ResourceGroupMetric extends TeaModel {
    /**
     * <p>The GPU type.</p>
     * 
     * <strong>example:</strong>
     * <p>A100</p>
     */
    @NameInMap("GpuType")
    public String gpuType;

    /**
     * <p>The performance metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>23000</p>
     */
    @NameInMap("Metrics")
    public java.util.List<Metric> metrics;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg17tmvwiokhzaxg</p>
     */
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
