// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConsumerGroupSubscriptionResponseBody body;

    public static DeleteConsumerGroupSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerGroupSubscriptionResponse self = new DeleteConsumerGroupSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerGroupSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConsumerGroupSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConsumerGroupSubscriptionResponse setBody(DeleteConsumerGroupSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConsumerGroupSubscriptionResponseBody getBody() {
        return this.body;
    }

}
