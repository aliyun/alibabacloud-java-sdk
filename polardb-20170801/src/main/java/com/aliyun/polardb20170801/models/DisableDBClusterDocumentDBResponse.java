// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisableDBClusterDocumentDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDBClusterDocumentDBResponseBody body;

    public static DisableDBClusterDocumentDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDBClusterDocumentDBResponse self = new DisableDBClusterDocumentDBResponse();
        return TeaModel.build(map, self);
    }

    public DisableDBClusterDocumentDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDBClusterDocumentDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDBClusterDocumentDBResponse setBody(DisableDBClusterDocumentDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDBClusterDocumentDBResponseBody getBody() {
        return this.body;
    }

}
