// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class BasicResourceSettingSpec extends TeaModel {
    /**
     * <p>The number of CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("cpu")
    public Double cpu;

    /**
     * <p>The capacity of the memory. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>4 GiB</p>
     */
    @NameInMap("memory")
    public String memory;

    public static BasicResourceSettingSpec build(java.util.Map<String, ?> map) throws Exception {
        BasicResourceSettingSpec self = new BasicResourceSettingSpec();
        return TeaModel.build(map, self);
    }

    public BasicResourceSettingSpec setCpu(Double cpu) {
        this.cpu = cpu;
        return this;
    }
    public Double getCpu() {
        return this.cpu;
    }

    public BasicResourceSettingSpec setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

}
