// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMiddlewareEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMiddlewareEndpointResponseBody body;

    public static GetMiddlewareEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMiddlewareEndpointResponse self = new GetMiddlewareEndpointResponse();
        return TeaModel.build(map, self);
    }

    public GetMiddlewareEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMiddlewareEndpointResponse setBody(GetMiddlewareEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMiddlewareEndpointResponseBody getBody() {
        return this.body;
    }

}
