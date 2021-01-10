// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqTopicNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqTopicNameResponseBody body;

    public static QueryMqSofamqTopicNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqTopicNameResponse self = new QueryMqSofamqTopicNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqTopicNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqTopicNameResponse setBody(QueryMqSofamqTopicNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqTopicNameResponseBody getBody() {
        return this.body;
    }

}
