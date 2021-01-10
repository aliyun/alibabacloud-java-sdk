// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasNwapprovalprocessIsdefaultexistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasNwapprovalprocessIsdefaultexistResponseBody body;

    public static QueryHasNwapprovalprocessIsdefaultexistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasNwapprovalprocessIsdefaultexistResponse self = new QueryHasNwapprovalprocessIsdefaultexistResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasNwapprovalprocessIsdefaultexistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasNwapprovalprocessIsdefaultexistResponse setBody(QueryHasNwapprovalprocessIsdefaultexistResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasNwapprovalprocessIsdefaultexistResponseBody getBody() {
        return this.body;
    }

}
