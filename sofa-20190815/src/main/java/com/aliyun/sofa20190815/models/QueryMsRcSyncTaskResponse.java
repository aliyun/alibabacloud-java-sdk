// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsRcSyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsRcSyncTaskResponseBody body;

    public static QueryMsRcSyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsRcSyncTaskResponse self = new QueryMsRcSyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsRcSyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsRcSyncTaskResponse setBody(QueryMsRcSyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsRcSyncTaskResponseBody getBody() {
        return this.body;
    }

}
