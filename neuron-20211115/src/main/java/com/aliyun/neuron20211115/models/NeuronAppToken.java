// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppToken extends TeaModel {
    @NameInMap("token")
    public String token;

    public static NeuronAppToken build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppToken self = new NeuronAppToken();
        return TeaModel.build(map, self);
    }

    public NeuronAppToken setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
