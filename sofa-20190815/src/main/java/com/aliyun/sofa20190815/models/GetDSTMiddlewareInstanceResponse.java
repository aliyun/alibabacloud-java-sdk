// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDSTMiddlewareInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDSTMiddlewareInstanceResponseBody body;

    public static GetDSTMiddlewareInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDSTMiddlewareInstanceResponse self = new GetDSTMiddlewareInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetDSTMiddlewareInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDSTMiddlewareInstanceResponse setBody(GetDSTMiddlewareInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDSTMiddlewareInstanceResponseBody getBody() {
        return this.body;
    }

}
