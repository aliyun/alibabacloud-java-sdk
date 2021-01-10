// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportODPSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportODPSchemasResponseBody body;

    public static ExportODPSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportODPSchemasResponse self = new ExportODPSchemasResponse();
        return TeaModel.build(map, self);
    }

    public ExportODPSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportODPSchemasResponse setBody(ExportODPSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportODPSchemasResponseBody getBody() {
        return this.body;
    }

}
