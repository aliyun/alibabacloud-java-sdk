// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMqTopicsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MqTopicPageResult body;

    public static ListMqTopicsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqTopicsResponse self = new ListMqTopicsResponse();
        return TeaModel.build(map, self);
    }

    public ListMqTopicsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqTopicsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMqTopicsResponse setBody(MqTopicPageResult body) {
        this.body = body;
        return this;
    }
    public MqTopicPageResult getBody() {
        return this.body;
    }

}
