// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineUserappgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasBaselineUserappgroupResponseBody body;

    public static QueryHasBaselineUserappgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineUserappgroupResponse self = new QueryHasBaselineUserappgroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineUserappgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasBaselineUserappgroupResponse setBody(QueryHasBaselineUserappgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasBaselineUserappgroupResponseBody getBody() {
        return this.body;
    }

}
