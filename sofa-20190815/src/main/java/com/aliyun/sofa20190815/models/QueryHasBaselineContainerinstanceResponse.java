// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineContainerinstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasBaselineContainerinstanceResponseBody body;

    public static QueryHasBaselineContainerinstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineContainerinstanceResponse self = new QueryHasBaselineContainerinstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineContainerinstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasBaselineContainerinstanceResponse setBody(QueryHasBaselineContainerinstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasBaselineContainerinstanceResponseBody getBody() {
        return this.body;
    }

}
