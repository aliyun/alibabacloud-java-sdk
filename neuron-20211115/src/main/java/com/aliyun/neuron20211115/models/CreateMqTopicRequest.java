// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMqTopicRequest extends TeaModel {
    @NameInMap("body")
    public MqTopic body;

    public static CreateMqTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMqTopicRequest self = new CreateMqTopicRequest();
        return TeaModel.build(map, self);
    }

    public CreateMqTopicRequest setBody(MqTopic body) {
        this.body = body;
        return this;
    }
    public MqTopic getBody() {
        return this.body;
    }

}
