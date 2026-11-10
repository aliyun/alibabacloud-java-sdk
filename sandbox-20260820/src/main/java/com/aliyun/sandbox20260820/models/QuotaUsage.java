// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class QuotaUsage extends TeaModel {
    /**
     * <p>已占用的 CPU 配额，单位为 vCPU，不是 CPU 使用率。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cpuCores")
    public Double cpuCores;

    /**
     * <p>尚未释放的实例授权数量。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("instanceCount")
    public Long instanceCount;

    /**
     * <p>已占用的内存配额，单位为 GB，不是进程实际内存。</p>
     * 
     * <strong>example:</strong>
     * <p>1.5</p>
     */
    @NameInMap("memoryGB")
    public Double memoryGB;

    public static QuotaUsage build(java.util.Map<String, ?> map) throws Exception {
        QuotaUsage self = new QuotaUsage();
        return TeaModel.build(map, self);
    }

    public QuotaUsage setCpuCores(Double cpuCores) {
        this.cpuCores = cpuCores;
        return this;
    }
    public Double getCpuCores() {
        return this.cpuCores;
    }

    public QuotaUsage setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    public QuotaUsage setMemoryGB(Double memoryGB) {
        this.memoryGB = memoryGB;
        return this;
    }
    public Double getMemoryGB() {
        return this.memoryGB;
    }

}
