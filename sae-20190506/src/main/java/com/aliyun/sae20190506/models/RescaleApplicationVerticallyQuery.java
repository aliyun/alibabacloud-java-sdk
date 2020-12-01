// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RescaleApplicationVerticallyQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Cpu")
    @Validation(required = true)
    public String cpu;

    @NameInMap("Memory")
    @Validation(required = true)
    public String memory;

    public static RescaleApplicationVerticallyQuery build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationVerticallyQuery self = new RescaleApplicationVerticallyQuery();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationVerticallyQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RescaleApplicationVerticallyQuery setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public RescaleApplicationVerticallyQuery setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

}
