// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSJobItemsResponseBody body;

    public static QueryTSJobItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobItemsResponse self = new QueryTSJobItemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSJobItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSJobItemsResponse setBody(QueryTSJobItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSJobItemsResponseBody getBody() {
        return this.body;
    }

}
