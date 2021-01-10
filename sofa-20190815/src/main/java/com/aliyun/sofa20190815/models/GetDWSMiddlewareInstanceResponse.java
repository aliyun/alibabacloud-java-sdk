// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSMiddlewareInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSMiddlewareInstanceResponseBody body;

    public static GetDWSMiddlewareInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSMiddlewareInstanceResponse self = new GetDWSMiddlewareInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSMiddlewareInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSMiddlewareInstanceResponse setBody(GetDWSMiddlewareInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSMiddlewareInstanceResponseBody getBody() {
        return this.body;
    }

}
