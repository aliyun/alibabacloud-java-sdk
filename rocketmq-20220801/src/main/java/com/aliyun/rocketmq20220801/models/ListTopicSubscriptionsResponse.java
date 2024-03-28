// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListTopicSubscriptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTopicSubscriptionsResponseBody body;

    public static ListTopicSubscriptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTopicSubscriptionsResponse self = new ListTopicSubscriptionsResponse();
        return TeaModel.build(map, self);
    }

    public ListTopicSubscriptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTopicSubscriptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTopicSubscriptionsResponse setBody(ListTopicSubscriptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTopicSubscriptionsResponseBody getBody() {
        return this.body;
    }

}
