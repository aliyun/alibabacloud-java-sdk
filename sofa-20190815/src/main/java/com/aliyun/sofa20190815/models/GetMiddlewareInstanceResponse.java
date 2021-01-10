// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMiddlewareInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMiddlewareInstanceResponseBody body;

    public static GetMiddlewareInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMiddlewareInstanceResponse self = new GetMiddlewareInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetMiddlewareInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMiddlewareInstanceResponse setBody(GetMiddlewareInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMiddlewareInstanceResponseBody getBody() {
        return this.body;
    }

}
