// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePdpPbcRequest extends TeaModel {
    @NameInMap("body")
    public PdpPbc body;

    public static CreatePdpPbcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePdpPbcRequest self = new CreatePdpPbcRequest();
        return TeaModel.build(map, self);
    }

    public CreatePdpPbcRequest setBody(PdpPbc body) {
        this.body = body;
        return this;
    }
    public PdpPbc getBody() {
        return this.body;
    }

}
