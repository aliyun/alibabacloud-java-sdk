// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqGroupSubDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqGroupSubDetailResponseBody body;

    public static QueryMqSofamqGroupSubDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqGroupSubDetailResponse self = new QueryMqSofamqGroupSubDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqGroupSubDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqGroupSubDetailResponse setBody(QueryMqSofamqGroupSubDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqGroupSubDetailResponseBody getBody() {
        return this.body;
    }

}
