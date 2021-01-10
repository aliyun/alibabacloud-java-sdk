// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSOperationRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSOperationRecordsResponseBody body;

    public static QueryTSOperationRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSOperationRecordsResponse self = new QueryTSOperationRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSOperationRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSOperationRecordsResponse setBody(QueryTSOperationRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSOperationRecordsResponseBody getBody() {
        return this.body;
    }

}
