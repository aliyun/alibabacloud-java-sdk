// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateResourceRequest extends TeaModel {
    @NameInMap("body")
    public ResourceUpdateCmd body;

    public static UpdateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceRequest self = new UpdateResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceRequest setBody(ResourceUpdateCmd body) {
        this.body = body;
        return this;
    }
    public ResourceUpdateCmd getBody() {
        return this.body;
    }

}
