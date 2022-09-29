// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePbcSchemaRequest extends TeaModel {
    @NameInMap("body")
    public PbcSchema body;

    public static UpdatePbcSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePbcSchemaRequest self = new UpdatePbcSchemaRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePbcSchemaRequest setBody(PbcSchema body) {
        this.body = body;
        return this;
    }
    public PbcSchema getBody() {
        return this.body;
    }

}
