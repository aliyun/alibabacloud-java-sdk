// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqMessageByTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqMessageByTopicResponseBody body;

    public static QueryMqSofamqMessageByTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqMessageByTopicResponse self = new QueryMqSofamqMessageByTopicResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqMessageByTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqMessageByTopicResponse setBody(QueryMqSofamqMessageByTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqMessageByTopicResponseBody getBody() {
        return this.body;
    }

}
