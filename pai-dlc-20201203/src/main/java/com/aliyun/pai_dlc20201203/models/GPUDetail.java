// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GPUDetail extends TeaModel {
    @NameInMap("GPU")
    public String GPU;

    @NameInMap("GPUType")
    public String GPUType;

    @NameInMap("GPUTypeFullName")
    public String GPUTypeFullName;

    public static GPUDetail build(java.util.Map<String, ?> map) throws Exception {
        GPUDetail self = new GPUDetail();
        return TeaModel.build(map, self);
    }

    public GPUDetail setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }
    public String getGPU() {
        return this.GPU;
    }

    public GPUDetail setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public GPUDetail setGPUTypeFullName(String GPUTypeFullName) {
        this.GPUTypeFullName = GPUTypeFullName;
        return this;
    }
    public String getGPUTypeFullName() {
        return this.GPUTypeFullName;
    }

}
