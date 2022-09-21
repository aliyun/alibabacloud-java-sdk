// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateIdleInstanceCullerRequest extends TeaModel {
    @NameInMap("CpuPercentThreshold")
    public Integer cpuPercentThreshold;

    @NameInMap("GpuPercentThreshold")
    public Integer gpuPercentThreshold;

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
