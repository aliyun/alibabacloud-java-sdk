// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportODPSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportODPSchemasResponseBody body;

    public static ImportODPSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportODPSchemasResponse self = new ImportODPSchemasResponse();
        return TeaModel.build(map, self);
    }

    public ImportODPSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportODPSchemasResponse setBody(ImportODPSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportODPSchemasResponseBody getBody() {
        return this.body;
    }

}
