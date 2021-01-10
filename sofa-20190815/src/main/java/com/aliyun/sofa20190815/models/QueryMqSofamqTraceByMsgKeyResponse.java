// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqTraceByMsgKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqTraceByMsgKeyResponseBody body;

    public static QueryMqSofamqTraceByMsgKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqTraceByMsgKeyResponse self = new QueryMqSofamqTraceByMsgKeyResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqTraceByMsgKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqTraceByMsgKeyResponse setBody(QueryMqSofamqTraceByMsgKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqTraceByMsgKeyResponseBody getBody() {
        return this.body;
    }

}
