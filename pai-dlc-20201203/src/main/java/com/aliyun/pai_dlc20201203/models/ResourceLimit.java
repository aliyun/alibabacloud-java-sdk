// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ResourceLimit extends TeaModel {
    /**
     * <p>The number of GPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CPU")
    public String CPU;

    /**
     * <p>The number of GPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("GPU")
    public String GPU;

    /**
     * <p>The memory capacity limit, in Gi.</p>
     * 
     * <strong>example:</strong>
     * <p>10Gi</p>
     */
    @NameInMap("Memory")
    public String memory;

    public static ResourceLimit build(java.util.Map<String, ?> map) throws Exception {
        ResourceLimit self = new ResourceLimit();
        return TeaModel.build(map, self);
    }

    public ResourceLimit setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }
    public String getCPU() {
        return this.CPU;
    }

    public ResourceLimit setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }
    public String getGPU() {
        return this.GPU;
    }

    public ResourceLimit setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

}
