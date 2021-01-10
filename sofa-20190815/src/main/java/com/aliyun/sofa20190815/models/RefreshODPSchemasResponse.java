// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RefreshODPSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshODPSchemasResponseBody body;

    public static RefreshODPSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshODPSchemasResponse self = new RefreshODPSchemasResponse();
        return TeaModel.build(map, self);
    }

    public RefreshODPSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshODPSchemasResponse setBody(RefreshODPSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshODPSchemasResponseBody getBody() {
        return this.body;
    }

}
