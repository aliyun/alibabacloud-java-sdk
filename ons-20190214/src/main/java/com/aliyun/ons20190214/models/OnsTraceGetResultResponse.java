// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceGetResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsTraceGetResultResponseBody body;

    public static OnsTraceGetResultResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsTraceGetResultResponse self = new OnsTraceGetResultResponse();
        return TeaModel.build(map, self);
    }

    public OnsTraceGetResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsTraceGetResultResponse setBody(OnsTraceGetResultResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsTraceGetResultResponseBody getBody() {
        return this.body;
    }

}
