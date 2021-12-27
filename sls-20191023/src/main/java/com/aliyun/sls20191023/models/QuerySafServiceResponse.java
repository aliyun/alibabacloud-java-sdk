// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class QuerySafServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySafServiceResponseBody body;

    public static QuerySafServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySafServiceResponse self = new QuerySafServiceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySafServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySafServiceResponse setBody(QuerySafServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySafServiceResponseBody getBody() {
        return this.body;
    }

}
