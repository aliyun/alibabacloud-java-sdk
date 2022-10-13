// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class PushFaultEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushFaultEventResponseBody body;

    public static PushFaultEventResponse build(java.util.Map<String, ?> map) throws Exception {
        PushFaultEventResponse self = new PushFaultEventResponse();
        return TeaModel.build(map, self);
    }

    public PushFaultEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushFaultEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushFaultEventResponse setBody(PushFaultEventResponseBody body) {
        this.body = body;
        return this;
    }
    public PushFaultEventResponseBody getBody() {
        return this.body;
    }

}
