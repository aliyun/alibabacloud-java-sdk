// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppTokenQuery extends TeaModel {
    @NameInMap("token")
    public String token;

    public static NeuronAppTokenQuery build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppTokenQuery self = new NeuronAppTokenQuery();
        return TeaModel.build(map, self);
    }

    public NeuronAppTokenQuery setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
