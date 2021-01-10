// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqMessageTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqMessageTraceResponseBody body;

    public static QueryMqSofamqMessageTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqMessageTraceResponse self = new QueryMqSofamqMessageTraceResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqMessageTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqMessageTraceResponse setBody(QueryMqSofamqMessageTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqMessageTraceResponseBody getBody() {
        return this.body;
    }

}
