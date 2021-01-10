// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobItemByNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSJobItemByNameResponseBody body;

    public static QueryTSJobItemByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobItemByNameResponse self = new QueryTSJobItemByNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSJobItemByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSJobItemByNameResponse setBody(QueryTSJobItemByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSJobItemByNameResponseBody getBody() {
        return this.body;
    }

}
