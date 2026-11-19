// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class QuotaUsage extends TeaModel {
    /**
     * <p>The consumed CPU quota in vCPUs, which does not represent CPU utilization.</p>
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
     * <p>The consumed memory quota in GB, which does not represent the actual memory used by processes.</p>
     * 
     * <strong>example:</strong>
     * <p>1.5</p>
     */
    @NameInMap("memoryGB")
    public Double memoryGB;

    /**
     * <p>The number of cores consumed from the team\&quot;s exclusive CPU creation quota that have not yet been naturally replenished. This is not the cumulative creation volume over the last minute. This field is omitted when no valid exclusive bucket snapshot is available, and actual zeros and decimals are retained.</p>
     * 
     * <strong>example:</strong>
     * <p>19.875</p>
     */
    @NameInMap("scalingCpuCoresPerMinute")
    public Double scalingCpuCoresPerMinute;

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

    public QuotaUsage setScalingCpuCoresPerMinute(Double scalingCpuCoresPerMinute) {
        this.scalingCpuCoresPerMinute = scalingCpuCoresPerMinute;
        return this;
    }
    public Double getScalingCpuCoresPerMinute() {
        return this.scalingCpuCoresPerMinute;
    }

}
