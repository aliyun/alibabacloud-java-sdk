// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceKeywordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsSgServiceKeywordResponseBody body;

    public static QueryMsSgServiceKeywordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceKeywordResponse self = new QueryMsSgServiceKeywordResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceKeywordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsSgServiceKeywordResponse setBody(QueryMsSgServiceKeywordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsSgServiceKeywordResponseBody getBody() {
        return this.body;
    }

}
