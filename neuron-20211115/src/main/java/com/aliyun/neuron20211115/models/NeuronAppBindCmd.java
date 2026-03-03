// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppBindCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("appId")
    public Long appId;

    public static NeuronAppBindCmd build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppBindCmd self = new NeuronAppBindCmd();
        return TeaModel.build(map, self);
    }

    public NeuronAppBindCmd setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

}
