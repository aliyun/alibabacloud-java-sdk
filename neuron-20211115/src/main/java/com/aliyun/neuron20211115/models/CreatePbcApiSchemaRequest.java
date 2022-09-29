// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcApiSchemaRequest extends TeaModel {
    @NameInMap("body")
    public PbcApiSchema body;

    public static CreatePbcApiSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcApiSchemaRequest self = new CreatePbcApiSchemaRequest();
        return TeaModel.build(map, self);
    }

    public CreatePbcApiSchemaRequest setBody(PbcApiSchema body) {
        this.body = body;
        return this;
    }
    public PbcApiSchema getBody() {
        return this.body;
    }

}
