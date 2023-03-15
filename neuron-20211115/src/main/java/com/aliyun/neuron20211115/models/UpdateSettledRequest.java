// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateSettledRequest extends TeaModel {
    @NameInMap("body")
    public SettledUpdateCmd body;

    public static UpdateSettledRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSettledRequest self = new UpdateSettledRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSettledRequest setBody(SettledUpdateCmd body) {
        this.body = body;
        return this;
    }
    public SettledUpdateCmd getBody() {
        return this.body;
    }

}
