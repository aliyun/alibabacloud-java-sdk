// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateSettledRequest extends TeaModel {
    @NameInMap("body")
    public SettledCreateCmd body;

    public static CreateSettledRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSettledRequest self = new CreateSettledRequest();
        return TeaModel.build(map, self);
    }

    public CreateSettledRequest setBody(SettledCreateCmd body) {
        this.body = body;
        return this;
    }
    public SettledCreateCmd getBody() {
        return this.body;
    }

}
