// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronMobiTokenCreateCmd extends TeaModel {
    @NameInMap("appId")
    public Long appId;

    public static NeuronMobiTokenCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        NeuronMobiTokenCreateCmd self = new NeuronMobiTokenCreateCmd();
        return TeaModel.build(map, self);
    }

    public NeuronMobiTokenCreateCmd setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

}
