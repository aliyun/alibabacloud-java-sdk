// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateComponentTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public ComponentTemplateCreateCmd body;

    public static CreateComponentTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComponentTemplateRequest self = new CreateComponentTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateComponentTemplateRequest setBody(ComponentTemplateCreateCmd body) {
        this.body = body;
        return this;
    }
    public ComponentTemplateCreateCmd getBody() {
        return this.body;
    }

}
