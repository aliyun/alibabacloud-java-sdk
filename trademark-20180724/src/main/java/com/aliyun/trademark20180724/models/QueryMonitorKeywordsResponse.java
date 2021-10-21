// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryMonitorKeywordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMonitorKeywordsResponseBody body;

    public static QueryMonitorKeywordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonitorKeywordsResponse self = new QueryMonitorKeywordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonitorKeywordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMonitorKeywordsResponse setBody(QueryMonitorKeywordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMonitorKeywordsResponseBody getBody() {
        return this.body;
    }

}
