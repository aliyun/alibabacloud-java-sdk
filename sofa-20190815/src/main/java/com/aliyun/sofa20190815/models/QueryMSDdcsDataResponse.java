// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMSDdcsDataResponseBody body;

    public static QueryMSDdcsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsDataResponse self = new QueryMSDdcsDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMSDdcsDataResponse setBody(QueryMSDdcsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMSDdcsDataResponseBody getBody() {
        return this.body;
    }

}
