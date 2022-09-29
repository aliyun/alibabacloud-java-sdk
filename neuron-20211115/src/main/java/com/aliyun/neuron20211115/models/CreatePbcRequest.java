// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcRequest extends TeaModel {
    @NameInMap("body")
    public Pbc body;

    public static CreatePbcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcRequest self = new CreatePbcRequest();
        return TeaModel.build(map, self);
    }

    public CreatePbcRequest setBody(Pbc body) {
        this.body = body;
        return this;
    }
    public Pbc getBody() {
        return this.body;
    }

}
