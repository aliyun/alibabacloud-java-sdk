// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePdpConfigRequest extends TeaModel {
    @NameInMap("body")
    public PdpConfig body;

    public static CreatePdpConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePdpConfigRequest self = new CreatePdpConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreatePdpConfigRequest setBody(PdpConfig body) {
        this.body = body;
        return this;
    }
    public PdpConfig getBody() {
        return this.body;
    }

}
