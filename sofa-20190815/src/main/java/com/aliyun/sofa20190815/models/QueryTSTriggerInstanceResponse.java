// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTriggerInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSTriggerInstanceResponseBody body;

    public static QueryTSTriggerInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTriggerInstanceResponse self = new QueryTSTriggerInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSTriggerInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSTriggerInstanceResponse setBody(QueryTSTriggerInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSTriggerInstanceResponseBody getBody() {
        return this.body;
    }

}
