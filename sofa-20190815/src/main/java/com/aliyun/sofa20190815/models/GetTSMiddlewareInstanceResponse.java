// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetTSMiddlewareInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTSMiddlewareInstanceResponseBody body;

    public static GetTSMiddlewareInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTSMiddlewareInstanceResponse self = new GetTSMiddlewareInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetTSMiddlewareInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTSMiddlewareInstanceResponse setBody(GetTSMiddlewareInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTSMiddlewareInstanceResponseBody getBody() {
        return this.body;
    }

}
