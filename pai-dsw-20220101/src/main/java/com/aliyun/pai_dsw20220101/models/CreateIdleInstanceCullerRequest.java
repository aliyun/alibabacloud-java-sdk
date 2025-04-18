// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateIdleInstanceCullerRequest extends TeaModel {
    /**
     * <p>The CPU utilization threshold. Unit: percentage. Valid values: 1 to 100. If the CPU utilization of the instance is lower than this threshold, the instance is considered idle.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("CpuPercentThreshold")
    public Integer cpuPercentThreshold;

    /**
     * <p>The GPU utilization threshold. Unit: percentage. Valid values: 1 to 100. This parameter takes effect only if the instance is of the GPU instance type. If both CPU and GPU utilization is lower than the thresholds, the instance is considered idle.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("GpuPercentThreshold")
    public Integer gpuPercentThreshold;

    /**
     * <p>The maximum time duration for which the instance is idle. Unit: minutes. If the time duration for which the instance is idle exceeds this value, the system automatically stops the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("MaxIdleTimeInMinutes")
    public Integer maxIdleTimeInMinutes;

    public static CreateIdleInstanceCullerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIdleInstanceCullerRequest self = new CreateIdleInstanceCullerRequest();
        return TeaModel.build(map, self);
    }

    public CreateIdleInstanceCullerRequest setCpuPercentThreshold(Integer cpuPercentThreshold) {
        this.cpuPercentThreshold = cpuPercentThreshold;
        return this;
    }
    public Integer getCpuPercentThreshold() {
        return this.cpuPercentThreshold;
    }

    public CreateIdleInstanceCullerRequest setGpuPercentThreshold(Integer gpuPercentThreshold) {
        this.gpuPercentThreshold = gpuPercentThreshold;
        return this;
    }
    public Integer getGpuPercentThreshold() {
        return this.gpuPercentThreshold;
    }

    public CreateIdleInstanceCullerRequest setMaxIdleTimeInMinutes(Integer maxIdleTimeInMinutes) {
        this.maxIdleTimeInMinutes = maxIdleTimeInMinutes;
        return this;
    }
    public Integer getMaxIdleTimeInMinutes() {
        return this.maxIdleTimeInMinutes;
    }

}
