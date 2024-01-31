// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSecurityEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HandleSecurityEventsResponseBody body;

    public static HandleSecurityEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        HandleSecurityEventsResponse self = new HandleSecurityEventsResponse();
        return TeaModel.build(map, self);
    }

    public HandleSecurityEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HandleSecurityEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HandleSecurityEventsResponse setBody(HandleSecurityEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public HandleSecurityEventsResponseBody getBody() {
        return this.body;
    }

}
