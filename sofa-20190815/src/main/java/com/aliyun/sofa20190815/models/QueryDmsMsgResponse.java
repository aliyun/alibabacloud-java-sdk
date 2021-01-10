// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDmsMsgResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDmsMsgResponseBody body;

    public static QueryDmsMsgResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDmsMsgResponse self = new QueryDmsMsgResponse();
        return TeaModel.build(map, self);
    }

    public QueryDmsMsgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDmsMsgResponse setBody(QueryDmsMsgResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDmsMsgResponseBody getBody() {
        return this.body;
    }

}
