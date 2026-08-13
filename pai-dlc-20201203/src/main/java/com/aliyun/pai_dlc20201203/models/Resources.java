// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class Resources extends TeaModel {
    /**
     * <p>The number of CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CPU")
    public String CPU;

    /**
     * <p>The number of GPU cards.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("GPU")
    public String GPU;

    /**
     * <p>The memory size.</p>
     * 
     * <strong>example:</strong>
     * <p>1024 (unit: GB)</p>
     */
    @NameInMap("Memory")
    public String memory;

    public static Resources build(java.util.Map<String, ?> map) throws Exception {
        Resources self = new Resources();
        return TeaModel.build(map, self);
    }

    public Resources setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }
    public String getCPU() {
        return this.CPU;
    }

    public Resources setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }
    public String getGPU() {
        return this.GPU;
    }

    public Resources setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

}
