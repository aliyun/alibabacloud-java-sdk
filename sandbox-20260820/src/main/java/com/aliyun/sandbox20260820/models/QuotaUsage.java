// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class QuotaUsage extends TeaModel {
    /**
     * <p>The consumed CPU quota in vCPUs, not the CPU utilization.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cpuCores")
    public Double cpuCores;

    /**
     * <p>The number of unreleased instance authorizations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("instanceCount")
    public Long instanceCount;

    /**
     * <p>The consumed memory quota in GB, not the actual memory used by processes.</p>
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
