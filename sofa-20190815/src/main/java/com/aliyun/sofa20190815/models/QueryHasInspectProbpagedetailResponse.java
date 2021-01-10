// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectProbpagedetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectProbpagedetailResponseBody body;

    public static QueryHasInspectProbpagedetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectProbpagedetailResponse self = new QueryHasInspectProbpagedetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectProbpagedetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectProbpagedetailResponse setBody(QueryHasInspectProbpagedetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectProbpagedetailResponseBody getBody() {
        return this.body;
    }

}
