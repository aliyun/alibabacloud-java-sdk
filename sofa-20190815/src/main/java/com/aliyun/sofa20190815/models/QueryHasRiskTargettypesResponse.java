// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskTargettypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasRiskTargettypesResponseBody body;

    public static QueryHasRiskTargettypesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskTargettypesResponse self = new QueryHasRiskTargettypesResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskTargettypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasRiskTargettypesResponse setBody(QueryHasRiskTargettypesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasRiskTargettypesResponseBody getBody() {
        return this.body;
    }

}
