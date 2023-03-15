// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMqTopicSubsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MqTopicSubsPageResult body;

    public static ListMqTopicSubsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqTopicSubsResponse self = new ListMqTopicSubsResponse();
        return TeaModel.build(map, self);
    }

    public ListMqTopicSubsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqTopicSubsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMqTopicSubsResponse setBody(MqTopicSubsPageResult body) {
        this.body = body;
        return this;
    }
    public MqTopicSubsPageResult getBody() {
        return this.body;
    }

}
