// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadUserSubscriptionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadUserSubscriptionListResponseBody body;

    public static ReadUserSubscriptionListResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadUserSubscriptionListResponse self = new ReadUserSubscriptionListResponse();
        return TeaModel.build(map, self);
    }

    public ReadUserSubscriptionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadUserSubscriptionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadUserSubscriptionListResponse setBody(ReadUserSubscriptionListResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadUserSubscriptionListResponseBody getBody() {
        return this.body;
    }

}
