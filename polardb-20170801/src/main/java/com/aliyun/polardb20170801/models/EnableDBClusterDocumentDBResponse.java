// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableDBClusterDocumentDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableDBClusterDocumentDBResponseBody body;

    public static EnableDBClusterDocumentDBResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDBClusterDocumentDBResponse self = new EnableDBClusterDocumentDBResponse();
        return TeaModel.build(map, self);
    }

    public EnableDBClusterDocumentDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDBClusterDocumentDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDBClusterDocumentDBResponse setBody(EnableDBClusterDocumentDBResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDBClusterDocumentDBResponseBody getBody() {
        return this.body;
    }

}
