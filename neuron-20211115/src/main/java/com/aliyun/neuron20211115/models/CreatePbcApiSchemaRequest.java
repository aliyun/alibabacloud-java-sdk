// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcApiSchemaRequest extends TeaModel {
    @NameInMap("body")
    public PbcApiSchemaCreateCmd body;

    public static CreatePbcApiSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcApiSchemaRequest self = new CreatePbcApiSchemaRequest();
        return TeaModel.build(map, self);
    }

    public CreatePbcApiSchemaRequest setBody(PbcApiSchemaCreateCmd body) {
        this.body = body;
        return this;
    }
    public PbcApiSchemaCreateCmd getBody() {
        return this.body;
    }

}
