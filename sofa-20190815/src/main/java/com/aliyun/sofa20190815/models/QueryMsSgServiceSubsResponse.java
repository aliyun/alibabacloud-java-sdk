// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceSubsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsSgServiceSubsResponseBody body;

    public static QueryMsSgServiceSubsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceSubsResponse self = new QueryMsSgServiceSubsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceSubsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsSgServiceSubsResponse setBody(QueryMsSgServiceSubsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsSgServiceSubsResponseBody getBody() {
        return this.body;
    }

}
