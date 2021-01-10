// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineKbasorganizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasBaselineKbasorganizationResponseBody body;

    public static QueryHasBaselineKbasorganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineKbasorganizationResponse self = new QueryHasBaselineKbasorganizationResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineKbasorganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasBaselineKbasorganizationResponse setBody(QueryHasBaselineKbasorganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasBaselineKbasorganizationResponseBody getBody() {
        return this.body;
    }

}
