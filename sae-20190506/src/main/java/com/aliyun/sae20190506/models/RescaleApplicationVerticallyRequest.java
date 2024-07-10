// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RescaleApplicationVerticallyRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The destination CPU specification. Unit: millicore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Cpu")
    public String cpu;

    /**
     * <p>The destination memory size. Unit: MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("Memory")
    public String memory;

    public static RescaleApplicationVerticallyRequest build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationVerticallyRequest self = new RescaleApplicationVerticallyRequest();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationVerticallyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RescaleApplicationVerticallyRequest setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public RescaleApplicationVerticallyRequest setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

}
