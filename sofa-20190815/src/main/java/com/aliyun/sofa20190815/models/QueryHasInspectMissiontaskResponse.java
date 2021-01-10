// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectMissiontaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectMissiontaskResponseBody body;

    public static QueryHasInspectMissiontaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectMissiontaskResponse self = new QueryHasInspectMissiontaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectMissiontaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectMissiontaskResponse setBody(QueryHasInspectMissiontaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectMissiontaskResponseBody getBody() {
        return this.body;
    }

}
