// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateComponentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public ComponentUpdateCmd body;

    public static UpdateComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentRequest self = new UpdateComponentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComponentRequest setBody(ComponentUpdateCmd body) {
        this.body = body;
        return this;
    }
    public ComponentUpdateCmd getBody() {
        return this.body;
    }

}
