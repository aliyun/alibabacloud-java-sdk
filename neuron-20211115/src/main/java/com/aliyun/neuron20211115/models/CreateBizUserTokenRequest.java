// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateBizUserTokenRequest extends TeaModel {
    @NameInMap("body")
    public NeuronBizUserTokenCreateCmd body;

    public static CreateBizUserTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBizUserTokenRequest self = new CreateBizUserTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateBizUserTokenRequest setBody(NeuronBizUserTokenCreateCmd body) {
        this.body = body;
        return this;
    }
    public NeuronBizUserTokenCreateCmd getBody() {
        return this.body;
    }

}
