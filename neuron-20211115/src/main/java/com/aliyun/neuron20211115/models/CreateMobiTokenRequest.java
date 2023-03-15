// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMobiTokenRequest extends TeaModel {
    @NameInMap("body")
    public NeuronMobiTokenCreateCmd body;

    public static CreateMobiTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMobiTokenRequest self = new CreateMobiTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateMobiTokenRequest setBody(NeuronMobiTokenCreateCmd body) {
        this.body = body;
        return this;
    }
    public NeuronMobiTokenCreateCmd getBody() {
        return this.body;
    }

}
