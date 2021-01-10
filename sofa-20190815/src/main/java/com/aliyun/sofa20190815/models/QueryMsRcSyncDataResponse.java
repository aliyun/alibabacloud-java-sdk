// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsRcSyncDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMsRcSyncDataResponseBody body;

    public static QueryMsRcSyncDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsRcSyncDataResponse self = new QueryMsRcSyncDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsRcSyncDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMsRcSyncDataResponse setBody(QueryMsRcSyncDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMsRcSyncDataResponseBody getBody() {
        return this.body;
    }

}
