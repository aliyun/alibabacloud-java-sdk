// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqGroupNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqGroupNameResponseBody body;

    public static QueryMqSofamqGroupNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqGroupNameResponse self = new QueryMqSofamqGroupNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqGroupNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqGroupNameResponse setBody(QueryMqSofamqGroupNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqGroupNameResponseBody getBody() {
        return this.body;
    }

}
