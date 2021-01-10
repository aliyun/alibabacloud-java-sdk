// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineAppinstancegroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasBaselineAppinstancegroupResponseBody body;

    public static QueryHasBaselineAppinstancegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineAppinstancegroupResponse self = new QueryHasBaselineAppinstancegroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineAppinstancegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasBaselineAppinstancegroupResponse setBody(QueryHasBaselineAppinstancegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasBaselineAppinstancegroupResponseBody getBody() {
        return this.body;
    }

}
