// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcSchemaRequest extends TeaModel {
    @NameInMap("body")
    public PbcSchemaCreateCmd body;

    public static CreatePbcSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcSchemaRequest self = new CreatePbcSchemaRequest();
        return TeaModel.build(map, self);
    }

    public CreatePbcSchemaRequest setBody(PbcSchemaCreateCmd body) {
        this.body = body;
        return this;
    }
    public PbcSchemaCreateCmd getBody() {
        return this.body;
    }

}
