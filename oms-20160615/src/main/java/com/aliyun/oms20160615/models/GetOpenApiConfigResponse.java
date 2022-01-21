// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetOpenApiConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOpenApiConfigResponseBody body;

    public static GetOpenApiConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpenApiConfigResponse self = new GetOpenApiConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetOpenApiConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpenApiConfigResponse setBody(GetOpenApiConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpenApiConfigResponseBody getBody() {
        return this.body;
    }

}
