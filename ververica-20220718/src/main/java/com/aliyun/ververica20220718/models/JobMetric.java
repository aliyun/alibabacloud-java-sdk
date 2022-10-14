// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JobMetric extends TeaModel {
    @NameInMap("totalCpu")
    public Double totalCpu;

    @NameInMap("totalMemoryByte")
    public Long totalMemoryByte;

    public static JobMetric build(java.util.Map<String, ?> map) throws Exception {
        JobMetric self = new JobMetric();
        return TeaModel.build(map, self);
    }

    public JobMetric setTotalCpu(Double totalCpu) {
        this.totalCpu = totalCpu;
        return this;
    }
    public Double getTotalCpu() {
        return this.totalCpu;
    }

    public JobMetric setTotalMemoryByte(Long totalMemoryByte) {
        this.totalMemoryByte = totalMemoryByte;
        return this;
    }
    public Long getTotalMemoryByte() {
        return this.totalMemoryByte;
    }

}
