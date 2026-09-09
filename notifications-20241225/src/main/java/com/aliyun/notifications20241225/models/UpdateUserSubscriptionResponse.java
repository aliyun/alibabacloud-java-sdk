// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class UpdateUserSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserSubscriptionResponseBody body;

    public static UpdateUserSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserSubscriptionResponse self = new UpdateUserSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserSubscriptionResponse setBody(UpdateUserSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserSubscriptionResponseBody getBody() {
        return this.body;
    }

}
