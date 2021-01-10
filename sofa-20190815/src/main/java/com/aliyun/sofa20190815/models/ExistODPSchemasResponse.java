// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExistODPSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExistODPSchemasResponseBody body;

    public static ExistODPSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        ExistODPSchemasResponse self = new ExistODPSchemasResponse();
        return TeaModel.build(map, self);
    }

    public ExistODPSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExistODPSchemasResponse setBody(ExistODPSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public ExistODPSchemasResponseBody getBody() {
        return this.body;
    }

}
