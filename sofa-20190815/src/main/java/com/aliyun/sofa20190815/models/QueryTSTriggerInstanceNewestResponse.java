// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTriggerInstanceNewestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSTriggerInstanceNewestResponseBody body;

    public static QueryTSTriggerInstanceNewestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTriggerInstanceNewestResponse self = new QueryTSTriggerInstanceNewestResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSTriggerInstanceNewestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSTriggerInstanceNewestResponse setBody(QueryTSTriggerInstanceNewestResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSTriggerInstanceNewestResponseBody getBody() {
        return this.body;
    }

}
