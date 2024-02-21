// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListConsumerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConsumerGroupsResponseBody body;

    public static ListConsumerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerGroupsResponse self = new ListConsumerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListConsumerGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsumerGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConsumerGroupsResponse setBody(ListConsumerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConsumerGroupsResponseBody getBody() {
        return this.body;
    }

}
