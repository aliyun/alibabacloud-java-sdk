// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMessageTraceResponseBody body;

    public static OnsMessageTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageTraceResponse self = new OnsMessageTraceResponse();
        return TeaModel.build(map, self);
    }

    public OnsMessageTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMessageTraceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsMessageTraceResponse setBody(OnsMessageTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMessageTraceResponseBody getBody() {
        return this.body;
    }

}
