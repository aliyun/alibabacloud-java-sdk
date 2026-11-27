// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class AgentSandboxInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("CPUCount")
    public Long CPUCount;

    /**
     * <strong>example:</strong>
     * <p>2026-10-30T06:00:00.500Z</p>
     */
    @NameInMap("CollectedAt")
    public String collectedAt;

    /**
     * <strong>example:</strong>
     * <p>21474836480</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("DiskTotal")
    public Long diskTotal;

    /**
     * <strong>example:</strong>
     * <p>4096</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MemoryMB")
    public Long memoryMB;

    public static AgentSandboxInfo build(java.util.Map<String, ?> map) throws Exception {
        AgentSandboxInfo self = new AgentSandboxInfo();
        return TeaModel.build(map, self);
    }

    public AgentSandboxInfo setCPUCount(Long CPUCount) {
        this.CPUCount = CPUCount;
        return this;
    }
    public Long getCPUCount() {
        return this.CPUCount;
    }

    public AgentSandboxInfo setCollectedAt(String collectedAt) {
        this.collectedAt = collectedAt;
        return this;
    }
    public String getCollectedAt() {
        return this.collectedAt;
    }

    public AgentSandboxInfo setDiskTotal(Long diskTotal) {
        this.diskTotal = diskTotal;
        return this;
    }
    public Long getDiskTotal() {
        return this.diskTotal;
    }

    public AgentSandboxInfo setMemoryMB(Long memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }
    public Long getMemoryMB() {
        return this.memoryMB;
    }

}
