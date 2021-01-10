// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectPodtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectPodtaskResponseBody body;

    public static QueryHasInspectPodtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectPodtaskResponse self = new QueryHasInspectPodtaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectPodtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectPodtaskResponse setBody(QueryHasInspectPodtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectPodtaskResponseBody getBody() {
        return this.body;
    }

}
