// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMqGroupRequest extends TeaModel {
    @NameInMap("body")
    public MqGroup body;

    public static CreateMqGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMqGroupRequest self = new CreateMqGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMqGroupRequest setBody(MqGroup body) {
        this.body = body;
        return this;
    }
    public MqGroup getBody() {
        return this.body;
    }

}
