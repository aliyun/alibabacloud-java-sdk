// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPSchemasInterceptorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchqueryODPSchemasInterceptorsResponseBody body;

    public static BatchqueryODPSchemasInterceptorsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPSchemasInterceptorsResponse self = new BatchqueryODPSchemasInterceptorsResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPSchemasInterceptorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchqueryODPSchemasInterceptorsResponse setBody(BatchqueryODPSchemasInterceptorsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchqueryODPSchemasInterceptorsResponseBody getBody() {
        return this.body;
    }

}
