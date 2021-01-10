// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqDLQMessageByGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqDLQMessageByGroupIdResponseBody body;

    public static QueryMqSofamqDLQMessageByGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqDLQMessageByGroupIdResponse self = new QueryMqSofamqDLQMessageByGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqDLQMessageByGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqDLQMessageByGroupIdResponse setBody(QueryMqSofamqDLQMessageByGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqDLQMessageByGroupIdResponseBody getBody() {
        return this.body;
    }

}
