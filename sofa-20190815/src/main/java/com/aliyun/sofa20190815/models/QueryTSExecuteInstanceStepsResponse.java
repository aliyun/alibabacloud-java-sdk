// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSExecuteInstanceStepsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSExecuteInstanceStepsResponseBody body;

    public static QueryTSExecuteInstanceStepsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSExecuteInstanceStepsResponse self = new QueryTSExecuteInstanceStepsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSExecuteInstanceStepsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSExecuteInstanceStepsResponse setBody(QueryTSExecuteInstanceStepsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSExecuteInstanceStepsResponseBody getBody() {
        return this.body;
    }

}
