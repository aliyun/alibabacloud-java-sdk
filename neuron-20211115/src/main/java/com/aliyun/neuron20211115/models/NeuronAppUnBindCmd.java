// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppUnBindCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("appId")
    public Long appId;

    /**
     * <strong>example:</strong>
     * <p>价格</p>
     */
    @NameInMap("reason")
    public String reason;

    public static NeuronAppUnBindCmd build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppUnBindCmd self = new NeuronAppUnBindCmd();
        return TeaModel.build(map, self);
    }

    public NeuronAppUnBindCmd setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public NeuronAppUnBindCmd setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
