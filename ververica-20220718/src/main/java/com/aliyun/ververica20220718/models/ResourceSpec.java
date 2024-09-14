// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ResourceSpec extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("cpu")
    public Double cpu;

    /**
     * <strong>example:</strong>
     * <p>4Gi</p>
     */
    @NameInMap("memory")
    public String memory;

    public static ResourceSpec build(java.util.Map<String, ?> map) throws Exception {
        ResourceSpec self = new ResourceSpec();
        return TeaModel.build(map, self);
    }

    public ResourceSpec setCpu(Double cpu) {
        this.cpu = cpu;
        return this;
    }
    public Double getCpu() {
        return this.cpu;
    }

    public ResourceSpec setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

}
