// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListConsumerGroupSubscriptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListConsumerGroupSubscriptionsResponseBody body;

    public static ListConsumerGroupSubscriptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerGroupSubscriptionsResponse self = new ListConsumerGroupSubscriptionsResponse();
        return TeaModel.build(map, self);
    }

    public ListConsumerGroupSubscriptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsumerGroupSubscriptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConsumerGroupSubscriptionsResponse setBody(ListConsumerGroupSubscriptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConsumerGroupSubscriptionsResponseBody getBody() {
        return this.body;
    }

}
