// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSExecuteInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSExecuteInstanceResponseBody body;

    public static QueryTSExecuteInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSExecuteInstanceResponse self = new QueryTSExecuteInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSExecuteInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSExecuteInstanceResponse setBody(QueryTSExecuteInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSExecuteInstanceResponseBody getBody() {
        return this.body;
    }

}
