// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class Quota extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("cpuCores")
    public Integer cpuCores;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("instanceCount")
    public Integer instanceCount;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("memoryGB")
    public Integer memoryGB;

    /**
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

    public Quota setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

}
