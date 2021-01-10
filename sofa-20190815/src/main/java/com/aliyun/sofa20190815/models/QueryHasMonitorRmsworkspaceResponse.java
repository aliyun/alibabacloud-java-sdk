// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasMonitorRmsworkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasMonitorRmsworkspaceResponseBody body;

    public static QueryHasMonitorRmsworkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasMonitorRmsworkspaceResponse self = new QueryHasMonitorRmsworkspaceResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasMonitorRmsworkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasMonitorRmsworkspaceResponse setBody(QueryHasMonitorRmsworkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasMonitorRmsworkspaceResponseBody getBody() {
        return this.body;
    }

}
