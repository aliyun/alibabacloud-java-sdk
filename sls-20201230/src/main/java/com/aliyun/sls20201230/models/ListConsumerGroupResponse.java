// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListConsumerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<ConsumerGroup> body;

    public static ListConsumerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerGroupResponse self = new ListConsumerGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListConsumerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsumerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConsumerGroupResponse setBody(java.util.List<ConsumerGroup> body) {
        this.body = body;
        return this;
    }
    public java.util.List<ConsumerGroup> getBody() {
        return this.body;
    }

}
