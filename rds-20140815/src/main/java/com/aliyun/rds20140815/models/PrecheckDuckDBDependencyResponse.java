// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class PrecheckDuckDBDependencyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PrecheckDuckDBDependencyResponseBody body;

    public static PrecheckDuckDBDependencyResponse build(java.util.Map<String, ?> map) throws Exception {
        PrecheckDuckDBDependencyResponse self = new PrecheckDuckDBDependencyResponse();
        return TeaModel.build(map, self);
    }

    public PrecheckDuckDBDependencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrecheckDuckDBDependencyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PrecheckDuckDBDependencyResponse setBody(PrecheckDuckDBDependencyResponseBody body) {
        this.body = body;
        return this;
    }
    public PrecheckDuckDBDependencyResponseBody getBody() {
        return this.body;
    }

}
