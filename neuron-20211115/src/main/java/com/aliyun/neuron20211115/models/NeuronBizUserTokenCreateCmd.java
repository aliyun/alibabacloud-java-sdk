// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronBizUserTokenCreateCmd extends TeaModel {
    @NameInMap("bizId")
    public String bizId;

    @NameInMap("permission")
    public String permission;

    public static NeuronBizUserTokenCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        NeuronBizUserTokenCreateCmd self = new NeuronBizUserTokenCreateCmd();
        return TeaModel.build(map, self);
    }

    public NeuronBizUserTokenCreateCmd setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public NeuronBizUserTokenCreateCmd setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

}
