// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaTaskcoveragenodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaTaskcoveragenodesResponseBody body;

    public static QueryLinkeLinkaTaskcoveragenodesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaTaskcoveragenodesResponse self = new QueryLinkeLinkaTaskcoveragenodesResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaTaskcoveragenodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaTaskcoveragenodesResponse setBody(QueryLinkeLinkaTaskcoveragenodesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaTaskcoveragenodesResponseBody getBody() {
        return this.body;
    }

}
