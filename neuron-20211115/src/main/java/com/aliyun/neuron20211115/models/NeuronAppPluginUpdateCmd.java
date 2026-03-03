// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppPluginUpdateCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("config")
    public MobiPluginConfig config;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    public static NeuronAppPluginUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppPluginUpdateCmd self = new NeuronAppPluginUpdateCmd();
        return TeaModel.build(map, self);
    }

    public NeuronAppPluginUpdateCmd setConfig(MobiPluginConfig config) {
        this.config = config;
        return this;
    }
    public MobiPluginConfig getConfig() {
        return this.config;
    }

    public NeuronAppPluginUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
