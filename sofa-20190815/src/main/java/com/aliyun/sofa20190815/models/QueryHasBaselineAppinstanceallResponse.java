// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineAppinstanceallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasBaselineAppinstanceallResponseBody body;

    public static QueryHasBaselineAppinstanceallResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineAppinstanceallResponse self = new QueryHasBaselineAppinstanceallResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineAppinstanceallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasBaselineAppinstanceallResponse setBody(QueryHasBaselineAppinstanceallResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasBaselineAppinstanceallResponseBody getBody() {
        return this.body;
    }

}
