// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListConsumerConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConsumerConnectionsResponseBody body;

    public static ListConsumerConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerConnectionsResponse self = new ListConsumerConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListConsumerConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsumerConnectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConsumerConnectionsResponse setBody(ListConsumerConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConsumerConnectionsResponseBody getBody() {
        return this.body;
    }

}
