// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class Quota extends TeaModel {
    /**
     * <p>The vCPU quota, in cores.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("cpuCores")
    public Integer cpuCores;

    /**
     * <p>The team snapshot-based sandbox creation concurrency quota, in requests. This value represents the maximum number of snapshot-based sandbox creation requests that can be executed at the same time. When updating, omit this parameter or set it to null to retain the original configuration. Set it to a positive integer to specify an exclusive quota. Set it to 0 to prohibit snapshot-based sandbox creation. Set it to -1 to clear the exclusive quota and restore the remaining quota of the shared account. In query responses, this parameter is omitted if it is not configured. An explicit value of 0 is retained, and -1 is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("createSandboxWithSnapshotConcurrency")
    public Integer createSandboxWithSnapshotConcurrency;

    /**
     * <p>The team snapshot creation concurrency quota, in requests. This value represents the maximum number of snapshot creation requests that can be executed at the same time. When updating, omit this parameter or set it to null to retain the original configuration. Set it to a positive integer to specify an exclusive quota. Set it to 0 to prohibit snapshot creation. Set it to -1 to clear the exclusive quota and restore the remaining quota of the shared account. In query responses, this parameter is omitted if it is not configured. An explicit value of 0 is retained, and -1 is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("createSnapshotConcurrency")
    public Integer createSnapshotConcurrency;

    /**
     * <p>The quota for active instances.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("instanceCount")
    public Integer instanceCount;

    /**
     * <p>The memory quota, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("memoryGB")
    public Integer memoryGB;

    /**
     * <p>The team sandbox hibernation concurrency quota, in requests. This value represents the maximum number of sandbox hibernation requests that can be executed at the same time. When updating, omit this parameter or set it to null to retain the original configuration. Set it to a positive integer to specify an exclusive quota. Set it to 0 to prohibit sandbox hibernation. Set it to -1 to clear the exclusive quota and restore the remaining quota of the shared account. In query responses, this parameter is omitted if it is not configured. An explicit value of 0 is retained, and -1 is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pauseConcurrency")
    public Integer pauseConcurrency;

    /**
     * <p>The team sandbox wake-up concurrency quota, in requests. This value represents the maximum number of sandbox wake-up requests that can be executed at the same time. When updating, omit this parameter or set it to null to retain the original configuration. Set it to a positive integer to specify an exclusive quota. Set it to 0 to prohibit sandbox wake-up. Set it to -1 to clear the exclusive quota and restore the remaining quota of the shared account. In query responses, this parameter is omitted if it is not configured. An explicit value of 0 is retained, and -1 is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("resumeConcurrency")
    public Integer resumeConcurrency;

    /**
     * <p>The team CPU creation rate, in cores per minute. When updating, omit this parameter or set it to null to retain the original configuration. Set it to a positive integer to specify an exclusive rate. Set it to 0 to prohibit new CPU capacity. Set it to -1 to clear the exclusive rate and restore the remaining rate of the shared account. In query responses, this parameter is omitted if it is not configured. An explicit value of 0 is retained, and -1 is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("scalingCpuCoresPerMinute")
    public Long scalingCpuCoresPerMinute;

    /**
     * <p>The quota tag value, which represents the team ID. Quotas are independently calculated based on this dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>7696f4cf-****</p>
     */
    @NameInMap("tagValue")
    public String tagValue;

    public static Quota build(java.util.Map<String, ?> map) throws Exception {
        Quota self = new Quota();
        return TeaModel.build(map, self);
    }

    public Quota setCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
        return this;
    }
    public Integer getCpuCores() {
        return this.cpuCores;
    }

    public Quota setCreateSandboxWithSnapshotConcurrency(Integer createSandboxWithSnapshotConcurrency) {
        this.createSandboxWithSnapshotConcurrency = createSandboxWithSnapshotConcurrency;
        return this;
    }
    public Integer getCreateSandboxWithSnapshotConcurrency() {
        return this.createSandboxWithSnapshotConcurrency;
    }

    public Quota setCreateSnapshotConcurrency(Integer createSnapshotConcurrency) {
        this.createSnapshotConcurrency = createSnapshotConcurrency;
        return this;
    }
    public Integer getCreateSnapshotConcurrency() {
        return this.createSnapshotConcurrency;
    }

    public Quota setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public Quota setMemoryGB(Integer memoryGB) {
        this.memoryGB = memoryGB;
        return this;
    }
    public Integer getMemoryGB() {
        return this.memoryGB;
    }

    public Quota setPauseConcurrency(Integer pauseConcurrency) {
        this.pauseConcurrency = pauseConcurrency;
        return this;
    }
    public Integer getPauseConcurrency() {
        return this.pauseConcurrency;
    }

    public Quota setResumeConcurrency(Integer resumeConcurrency) {
        this.resumeConcurrency = resumeConcurrency;
        return this;
    }
    public Integer getResumeConcurrency() {
        return this.resumeConcurrency;
    }

    public Quota setScalingCpuCoresPerMinute(Long scalingCpuCoresPerMinute) {
        this.scalingCpuCoresPerMinute = scalingCpuCoresPerMinute;
        return this;
    }
    public Long getScalingCpuCoresPerMinute() {
        return this.scalingCpuCoresPerMinute;
    }

    public Quota setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

}
