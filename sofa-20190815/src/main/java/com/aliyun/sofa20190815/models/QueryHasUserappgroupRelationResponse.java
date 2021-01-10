// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasUserappgroupRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasUserappgroupRelationResponseBody body;

    public static QueryHasUserappgroupRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasUserappgroupRelationResponse self = new QueryHasUserappgroupRelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasUserappgroupRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasUserappgroupRelationResponse setBody(QueryHasUserappgroupRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasUserappgroupRelationResponseBody getBody() {
        return this.body;
    }

}
