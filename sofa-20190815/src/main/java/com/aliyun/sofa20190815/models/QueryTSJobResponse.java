// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSJobResponseBody body;

    public static QueryTSJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSJobResponse self = new QueryTSJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSJobResponse setBody(QueryTSJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSJobResponseBody getBody() {
        return this.body;
    }

}
