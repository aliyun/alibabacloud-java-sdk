// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateODPSchemasInterceptorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateODPSchemasInterceptorsResponseBody body;

    public static UpdateODPSchemasInterceptorsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateODPSchemasInterceptorsResponse self = new UpdateODPSchemasInterceptorsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateODPSchemasInterceptorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateODPSchemasInterceptorsResponse setBody(UpdateODPSchemasInterceptorsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateODPSchemasInterceptorsResponseBody getBody() {
        return this.body;
    }

}
