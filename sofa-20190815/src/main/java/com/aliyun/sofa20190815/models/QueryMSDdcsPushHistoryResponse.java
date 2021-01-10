// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsPushHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMSDdcsPushHistoryResponseBody body;

    public static QueryMSDdcsPushHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsPushHistoryResponse self = new QueryMSDdcsPushHistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsPushHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMSDdcsPushHistoryResponse setBody(QueryMSDdcsPushHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMSDdcsPushHistoryResponseBody getBody() {
        return this.body;
    }

}
