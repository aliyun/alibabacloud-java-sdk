// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OnlineODPSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnlineODPSchemasResponseBody body;

    public static OnlineODPSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        OnlineODPSchemasResponse self = new OnlineODPSchemasResponse();
        return TeaModel.build(map, self);
    }

    public OnlineODPSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnlineODPSchemasResponse setBody(OnlineODPSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public OnlineODPSchemasResponseBody getBody() {
        return this.body;
    }

}
