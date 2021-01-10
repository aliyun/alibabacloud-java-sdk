// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPSchemasNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchqueryODPSchemasNamesResponseBody body;

    public static BatchqueryODPSchemasNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPSchemasNamesResponse self = new BatchqueryODPSchemasNamesResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPSchemasNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchqueryODPSchemasNamesResponse setBody(BatchqueryODPSchemasNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchqueryODPSchemasNamesResponseBody getBody() {
        return this.body;
    }

}
