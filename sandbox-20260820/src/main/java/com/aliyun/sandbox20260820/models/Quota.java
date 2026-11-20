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
     * <p>The concurrent quota for creating sandboxes from snapshots in a team. This indicates the maximum number of requests for creating sandboxes from snapshots that can be executed at the same time. Omit or pass null to retain the original configuration during updates. A positive integer sets an exclusive quota. 0 prohibits creating sandboxes from snapshots. -1 clears the exclusive quota and restores the remaining quota of the shared account. During queries, this field is omitted if not configured, an explicit 0 is retained, and -1 is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("createSessionWithSnapshotConcurrency")
    public Integer createSessionWithSnapshotConcurrency;

    /**
     * <p>The concurrent quota for creating snapshots in a team. This indicates the maximum number of snapshot creation requests that can be executed at the same time. Omit or pass null to retain the original configuration during updates. A positive integer sets an exclusive quota. 0 prohibits creating snapshots. -1 clears the exclusive quota and restores the remaining quota of the shared account. During queries, this field is omitted if not configured, an explicit 0 is retained, and -1 is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("createSnapshotConcurrency")
    public Integer createSnapshotConcurrency;

    /**
     * <p>The quota for the number of running instances.</p>
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
     * <p>The concurrent quota for sandbox hibernation in a team. This indicates the maximum number of sandbox hibernation requests that can be executed at the same time. Omit or pass null to retain the original configuration during updates. A positive integer sets an exclusive quota. 0 prohibits sandbox hibernation. -1 clears the exclusive quota and restores the remaining quota of the shared account. During queries, this field is omitted if not configured, an explicit 0 is retained, and -1 is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pauseConcurrency")
    public Integer pauseConcurrency;

    /**
     * <p>The concurrent quota for resuming sandboxes in a team. This indicates the maximum number of sandbox resumption requests that can be executed at the same time. Omit or pass null to retain the original configuration during updates. A positive integer sets an exclusive quota. 0 prohibits resuming sandboxes. -1 clears the exclusive quota and restores the remaining quota of the shared account. During queries, this field is omitted if not configured, an explicit 0 is retained, and -1 is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("resumeConcurrency")
    public Integer resumeConcurrency;

    /**
     * <p>The Team CPU creation rate, in cores per minute. Omit or pass null to retain the original configuration during updates. A positive integer sets an exclusive rate. 0 prohibits adding new CPU capacity. -1 clears the exclusive rate and restores the remaining rate of the shared account. During queries, this field is omitted if not configured, an explicit 0 is retained, and -1 is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("scalingCpuCoresPerMinute")
    public Long scalingCpuCoresPerMinute;

    /**
     * <p>The quota tag value. This value is the team ID, and quotas are calculated independently based on this dimension.</p>
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

    public Quota setCreateSessionWithSnapshotConcurrency(Integer createSessionWithSnapshotConcurrency) {
        this.createSessionWithSnapshotConcurrency = createSessionWithSnapshotConcurrency;
        return this;
    }
    public Integer getCreateSessionWithSnapshotConcurrency() {
        return this.createSessionWithSnapshotConcurrency;
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
