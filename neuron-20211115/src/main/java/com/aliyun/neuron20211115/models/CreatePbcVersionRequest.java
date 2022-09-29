// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcVersionRequest extends TeaModel {
    @NameInMap("body")
    public PbcVersionCmd body;

    public static CreatePbcVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcVersionRequest self = new CreatePbcVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreatePbcVersionRequest setBody(PbcVersionCmd body) {
        this.body = body;
        return this;
    }
    public PbcVersionCmd getBody() {
        return this.body;
    }

}
