// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class Resources extends TeaModel {
    // CPU核心数
    @NameInMap("CPU")
    public String CPU;

    // GPU卡数
    @NameInMap("GPU")
    public String GPU;

    // 内存大小
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
