// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GPUMetric extends TeaModel {
    @NameInMap("Index")
    public Long index;

    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>0：异常；1：正常</p>
     */
    @NameInMap("Status")
    public Long status;

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
