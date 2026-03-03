// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ObtainMqConsoleLinkRequest extends TeaModel {
    @NameInMap("body")
    public ObtainMqConsoleLinkCmd body;

    public static ObtainMqConsoleLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ObtainMqConsoleLinkRequest self = new ObtainMqConsoleLinkRequest();
        return TeaModel.build(map, self);
    }

    public ObtainMqConsoleLinkRequest setBody(ObtainMqConsoleLinkCmd body) {
        this.body = body;
        return this;
    }
    public ObtainMqConsoleLinkCmd getBody() {
        return this.body;
    }

}
