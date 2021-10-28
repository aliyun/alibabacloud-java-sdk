// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class PushDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushDataResponseBody body;

    public static PushDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PushDataResponse self = new PushDataResponse();
        return TeaModel.build(map, self);
    }

    public PushDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushDataResponse setBody(PushDataResponseBody body) {
        this.body = body;
        return this;
    }
    public PushDataResponseBody getBody() {
        return this.body;
    }

}
