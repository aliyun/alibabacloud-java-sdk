// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PreviewComponentCrdSchemaRequest extends TeaModel {
    @NameInMap("body")
    public PreviewComponentCrdSchemaCmd body;

    public static PreviewComponentCrdSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewComponentCrdSchemaRequest self = new PreviewComponentCrdSchemaRequest();
        return TeaModel.build(map, self);
    }

    public PreviewComponentCrdSchemaRequest setBody(PreviewComponentCrdSchemaCmd body) {
        this.body = body;
        return this;
    }
    public PreviewComponentCrdSchemaCmd getBody() {
        return this.body;
    }

}
