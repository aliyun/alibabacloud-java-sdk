// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqTopicSubDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqTopicSubDetailResponseBody body;

    public static QueryMqSofamqTopicSubDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqTopicSubDetailResponse self = new QueryMqSofamqTopicSubDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqTopicSubDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqTopicSubDetailResponse setBody(QueryMqSofamqTopicSubDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqTopicSubDetailResponseBody getBody() {
        return this.body;
    }

}
