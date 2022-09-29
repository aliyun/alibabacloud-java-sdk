// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePbcApiSchemaRequest extends TeaModel {
    @NameInMap("body")
    public PbcApiSchema body;

    public static UpdatePbcApiSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePbcApiSchemaRequest self = new UpdatePbcApiSchemaRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePbcApiSchemaRequest setBody(PbcApiSchema body) {
        this.body = body;
        return this;
    }
    public PbcApiSchema getBody() {
        return this.body;
    }

}
