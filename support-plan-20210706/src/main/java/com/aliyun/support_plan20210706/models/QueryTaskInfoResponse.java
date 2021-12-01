// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class QueryTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTaskInfoResponseBody body;

    public static QueryTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskInfoResponse self = new QueryTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTaskInfoResponse setBody(QueryTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTaskInfoResponseBody getBody() {
        return this.body;
    }

}
