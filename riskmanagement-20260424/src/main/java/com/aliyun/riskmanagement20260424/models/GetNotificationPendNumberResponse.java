// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetNotificationPendNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNotificationPendNumberResponseBody body;

    public static GetNotificationPendNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNotificationPendNumberResponse self = new GetNotificationPendNumberResponse();
        return TeaModel.build(map, self);
    }

    public GetNotificationPendNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNotificationPendNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNotificationPendNumberResponse setBody(GetNotificationPendNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNotificationPendNumberResponseBody getBody() {
        return this.body;
    }

}
