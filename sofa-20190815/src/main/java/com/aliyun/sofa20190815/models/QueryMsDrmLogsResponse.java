// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsDrmLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsDrmLogsResponseBody body;

    public static QueryMsDrmLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsDrmLogsResponse self = new QueryMsDrmLogsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsDrmLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsDrmLogsResponse setBody(QueryMsDrmLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsDrmLogsResponseBody getBody() {
        return this.body;
    }

}
