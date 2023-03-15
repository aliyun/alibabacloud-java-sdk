// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcInvokeRequest extends TeaModel {
    @NameInMap("body")
    public PbcInvokeCreateCmd body;

    public static CreatePbcInvokeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcInvokeRequest self = new CreatePbcInvokeRequest();
        return TeaModel.build(map, self);
    }

    public CreatePbcInvokeRequest setBody(PbcInvokeCreateCmd body) {
        this.body = body;
        return this;
    }
    public PbcInvokeCreateCmd getBody() {
        return this.body;
    }

}
