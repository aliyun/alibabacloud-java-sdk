// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPSchemasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchqueryODPSchemasResponseBody body;

    public static BatchqueryODPSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPSchemasResponse self = new BatchqueryODPSchemasResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchqueryODPSchemasResponse setBody(BatchqueryODPSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchqueryODPSchemasResponseBody getBody() {
        return this.body;
    }

}
