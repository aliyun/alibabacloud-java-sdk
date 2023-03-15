// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMqTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MqTopic body;

    public static CreateMqTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMqTopicResponse self = new CreateMqTopicResponse();
        return TeaModel.build(map, self);
    }

    public CreateMqTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMqTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMqTopicResponse setBody(MqTopic body) {
        this.body = body;
        return this;
    }
    public MqTopic getBody() {
        return this.body;
    }

}
