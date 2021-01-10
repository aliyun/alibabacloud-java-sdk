// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineAppinstancegroupallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasBaselineAppinstancegroupallResponseBody body;

    public static QueryHasBaselineAppinstancegroupallResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineAppinstancegroupallResponse self = new QueryHasBaselineAppinstancegroupallResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineAppinstancegroupallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasBaselineAppinstancegroupallResponse setBody(QueryHasBaselineAppinstancegroupallResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasBaselineAppinstancegroupallResponseBody getBody() {
        return this.body;
    }

}
