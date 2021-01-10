// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMeshMiddlewareInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMeshMiddlewareInstanceResponseBody body;

    public static GetMeshMiddlewareInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMeshMiddlewareInstanceResponse self = new GetMeshMiddlewareInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetMeshMiddlewareInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMeshMiddlewareInstanceResponse setBody(GetMeshMiddlewareInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMeshMiddlewareInstanceResponseBody getBody() {
        return this.body;
    }

}
