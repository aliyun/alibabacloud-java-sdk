// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectProbpageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectProbpageResponseBody body;

    public static QueryHasInspectProbpageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectProbpageResponse self = new QueryHasInspectProbpageResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectProbpageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectProbpageResponse setBody(QueryHasInspectProbpageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectProbpageResponseBody getBody() {
        return this.body;
    }

}
