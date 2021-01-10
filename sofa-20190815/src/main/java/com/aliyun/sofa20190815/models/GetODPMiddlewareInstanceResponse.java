// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetODPMiddlewareInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetODPMiddlewareInstanceResponseBody body;

    public static GetODPMiddlewareInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetODPMiddlewareInstanceResponse self = new GetODPMiddlewareInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetODPMiddlewareInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetODPMiddlewareInstanceResponse setBody(GetODPMiddlewareInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetODPMiddlewareInstanceResponseBody getBody() {
        return this.body;
    }

}
