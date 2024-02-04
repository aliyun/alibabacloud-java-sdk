// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class AcceptPartnerNotificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptPartnerNotificationResponseBody body;

    public static AcceptPartnerNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptPartnerNotificationResponse self = new AcceptPartnerNotificationResponse();
        return TeaModel.build(map, self);
    }

    public AcceptPartnerNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptPartnerNotificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptPartnerNotificationResponse setBody(AcceptPartnerNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptPartnerNotificationResponseBody getBody() {
        return this.body;
    }

}
