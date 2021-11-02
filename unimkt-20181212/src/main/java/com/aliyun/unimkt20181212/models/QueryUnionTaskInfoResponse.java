// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUnionTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUnionTaskInfoResponseBody body;

    public static QueryUnionTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionTaskInfoResponse self = new QueryUnionTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnionTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUnionTaskInfoResponse setBody(QueryUnionTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUnionTaskInfoResponseBody getBody() {
        return this.body;
    }

}
