// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectMissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectMissionResponseBody body;

    public static QueryHasInspectMissionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectMissionResponse self = new QueryHasInspectMissionResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectMissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectMissionResponse setBody(QueryHasInspectMissionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectMissionResponseBody getBody() {
        return this.body;
    }

}
