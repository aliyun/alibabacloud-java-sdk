// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaGrouphistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinkaGrouphistoryResponseBody body;

    public static QueryLinkeLinkaGrouphistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaGrouphistoryResponse self = new QueryLinkeLinkaGrouphistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaGrouphistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinkaGrouphistoryResponse setBody(QueryLinkeLinkaGrouphistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinkaGrouphistoryResponseBody getBody() {
        return this.body;
    }

}
