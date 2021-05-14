// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSecurityEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public HandleSecurityEventsResponse setBody(HandleSecurityEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public HandleSecurityEventsResponseBody getBody() {
        return this.body;
    }

}
