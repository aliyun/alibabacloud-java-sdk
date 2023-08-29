// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class TrustEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TrustEventsResponseBody body;

    public static TrustEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        TrustEventsResponse self = new TrustEventsResponse();
        return TeaModel.build(map, self);
    }

    public TrustEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrustEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrustEventsResponse setBody(TrustEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public TrustEventsResponseBody getBody() {
        return this.body;
    }

}
