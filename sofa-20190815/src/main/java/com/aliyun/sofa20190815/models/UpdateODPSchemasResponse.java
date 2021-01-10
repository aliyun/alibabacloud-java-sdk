// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateODPSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateODPSchemasResponseBody body;

    public static UpdateODPSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateODPSchemasResponse self = new UpdateODPSchemasResponse();
        return TeaModel.build(map, self);
    }

    public UpdateODPSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateODPSchemasResponse setBody(UpdateODPSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateODPSchemasResponseBody getBody() {
        return this.body;
    }

}
