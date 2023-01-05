// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SuspendCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SuspendCallResponseBody body;

    public static SuspendCallResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendCallResponse self = new SuspendCallResponse();
        return TeaModel.build(map, self);
    }

    public SuspendCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendCallResponse setBody(SuspendCallResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendCallResponseBody getBody() {
        return this.body;
    }

}
