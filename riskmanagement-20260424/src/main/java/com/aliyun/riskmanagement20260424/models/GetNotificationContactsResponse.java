// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetNotificationContactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNotificationContactsResponseBody body;

    public static GetNotificationContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNotificationContactsResponse self = new GetNotificationContactsResponse();
        return TeaModel.build(map, self);
    }

    public GetNotificationContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNotificationContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNotificationContactsResponse setBody(GetNotificationContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNotificationContactsResponseBody getBody() {
        return this.body;
    }

}
