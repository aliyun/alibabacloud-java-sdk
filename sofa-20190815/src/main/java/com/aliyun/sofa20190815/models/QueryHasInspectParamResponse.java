// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectParamResponseBody body;

    public static QueryHasInspectParamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectParamResponse self = new QueryHasInspectParamResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectParamResponse setBody(QueryHasInspectParamResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectParamResponseBody getBody() {
        return this.body;
    }

}
