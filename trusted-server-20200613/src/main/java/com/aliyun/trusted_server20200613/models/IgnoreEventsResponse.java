// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class IgnoreEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public IgnoreEventsResponseBody body;

    public static IgnoreEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        IgnoreEventsResponse self = new IgnoreEventsResponse();
        return TeaModel.build(map, self);
    }

    public IgnoreEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IgnoreEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IgnoreEventsResponse setBody(IgnoreEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public IgnoreEventsResponseBody getBody() {
        return this.body;
    }

}
