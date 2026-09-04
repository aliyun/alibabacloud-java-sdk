// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ResetUserSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetUserSubscriptionResponseBody body;

    public static ResetUserSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetUserSubscriptionResponse self = new ResetUserSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public ResetUserSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetUserSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetUserSubscriptionResponse setBody(ResetUserSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetUserSubscriptionResponseBody getBody() {
        return this.body;
    }

}
