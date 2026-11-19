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
     * <p>The quota for the number of active instances.</p>
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
     * <p>The team CPU creation rate in cores per minute. To retain the original configuration during an update, omit this parameter or set it to null. A positive integer sets an exclusive rate. A value of 0 prevents adding new CPU capacity. A value of -1 clears the exclusive rate and restores the remaining shared account rate. When queried, this parameter is omitted if it is not configured, an explicit 0 is retained, and -1 is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("scalingCpuCoresPerMinute")
    public Long scalingCpuCoresPerMinute;

    /**
     * <p>The quota tag value, which is set to the team ID. Quotas are independently calculated based on this dimension.</p>
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
