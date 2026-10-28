// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GPUMetric extends TeaModel {
    /**
     * <p>The GPU index.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Index")
    public Long index;

    /**
     * <p>The GPU model.</p>
     * 
     * <strong>example:</strong>
     * <p>NVIDIA V100</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The card status.</p>
     * 
     * <strong>example:</strong>
     * <p>0：异常；1：正常</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>The GPU utilization.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("UsageRate")
    public Float usageRate;

    public static GPUMetric build(java.util.Map<String, ?> map) throws Exception {
        GPUMetric self = new GPUMetric();
        return TeaModel.build(map, self);
    }

    public GPUMetric setIndex(Long index) {
        this.index = index;
        return this;
    }
    public Long getIndex() {
        return this.index;
    }

    public GPUMetric setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public GPUMetric setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public GPUMetric setUsageRate(Float usageRate) {
        this.usageRate = usageRate;
        return this;
    }
    public Float getUsageRate() {
        return this.usageRate;
    }

}
