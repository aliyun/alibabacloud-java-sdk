// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectImagetaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectImagetaskResponseBody body;

    public static QueryHasInspectImagetaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectImagetaskResponse self = new QueryHasInspectImagetaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectImagetaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectImagetaskResponse setBody(QueryHasInspectImagetaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectImagetaskResponseBody getBody() {
        return this.body;
    }

}
