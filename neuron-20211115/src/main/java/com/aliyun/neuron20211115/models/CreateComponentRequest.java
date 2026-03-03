// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateComponentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public ComponentCreateCmd body;

    public static CreateComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComponentRequest self = new CreateComponentRequest();
        return TeaModel.build(map, self);
    }

    public CreateComponentRequest setBody(ComponentCreateCmd body) {
        this.body = body;
        return this;
    }
    public ComponentCreateCmd getBody() {
        return this.body;
    }

}
