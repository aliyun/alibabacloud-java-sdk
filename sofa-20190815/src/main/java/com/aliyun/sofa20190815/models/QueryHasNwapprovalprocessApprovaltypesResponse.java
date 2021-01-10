// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasNwapprovalprocessApprovaltypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasNwapprovalprocessApprovaltypesResponseBody body;

    public static QueryHasNwapprovalprocessApprovaltypesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasNwapprovalprocessApprovaltypesResponse self = new QueryHasNwapprovalprocessApprovaltypesResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasNwapprovalprocessApprovaltypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasNwapprovalprocessApprovaltypesResponse setBody(QueryHasNwapprovalprocessApprovaltypesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasNwapprovalprocessApprovaltypesResponseBody getBody() {
        return this.body;
    }

}
