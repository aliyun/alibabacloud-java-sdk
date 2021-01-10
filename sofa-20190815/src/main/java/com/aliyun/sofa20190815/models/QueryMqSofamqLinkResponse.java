// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMqSofamqLinkResponseBody body;

    public static QueryMqSofamqLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqLinkResponse self = new QueryMqSofamqLinkResponse();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMqSofamqLinkResponse setBody(QueryMqSofamqLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMqSofamqLinkResponseBody getBody() {
        return this.body;
    }

}
