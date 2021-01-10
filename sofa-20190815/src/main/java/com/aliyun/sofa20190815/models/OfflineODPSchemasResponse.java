// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OfflineODPSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OfflineODPSchemasResponseBody body;

    public static OfflineODPSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineODPSchemasResponse self = new OfflineODPSchemasResponse();
        return TeaModel.build(map, self);
    }

    public OfflineODPSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineODPSchemasResponse setBody(OfflineODPSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineODPSchemasResponseBody getBody() {
        return this.body;
    }

}
