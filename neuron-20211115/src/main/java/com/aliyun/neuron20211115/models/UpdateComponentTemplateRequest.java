// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateComponentTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public ComponentTemplateUpdateCmd body;

    public static UpdateComponentTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentTemplateRequest self = new UpdateComponentTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComponentTemplateRequest setBody(ComponentTemplateUpdateCmd body) {
        this.body = body;
        return this;
    }
    public ComponentTemplateUpdateCmd getBody() {
        return this.body;
    }

}
