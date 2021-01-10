// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineProdinstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasBaselineProdinstanceResponseBody body;

    public static QueryHasBaselineProdinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineProdinstanceResponse self = new QueryHasBaselineProdinstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineProdinstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasBaselineProdinstanceResponse setBody(QueryHasBaselineProdinstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasBaselineProdinstanceResponseBody getBody() {
        return this.body;
    }

}
