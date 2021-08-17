// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opt20210730.models;

import com.aliyun.tea.*;

public class GetOpenStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOpenStatusResponseBody body;

    public static GetOpenStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpenStatusResponse self = new GetOpenStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetOpenStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpenStatusResponse setBody(GetOpenStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpenStatusResponseBody getBody() {
        return this.body;
    }

}
