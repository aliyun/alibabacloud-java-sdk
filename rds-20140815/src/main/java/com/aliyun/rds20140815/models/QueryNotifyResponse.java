// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class QueryNotifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryNotifyResponseBody body;

    public static QueryNotifyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNotifyResponse self = new QueryNotifyResponse();
        return TeaModel.build(map, self);
    }

    public QueryNotifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryNotifyResponse setBody(QueryNotifyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryNotifyResponseBody getBody() {
        return this.body;
    }

}
