// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetEntityRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEntityRouteResponseBody body;

    public static GetEntityRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEntityRouteResponse self = new GetEntityRouteResponse();
        return TeaModel.build(map, self);
    }

    public GetEntityRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEntityRouteResponse setBody(GetEntityRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEntityRouteResponseBody getBody() {
        return this.body;
    }

}
