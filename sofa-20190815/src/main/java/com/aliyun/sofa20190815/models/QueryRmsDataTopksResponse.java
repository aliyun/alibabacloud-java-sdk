// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsDataTopksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsDataTopksResponseBody body;

    public static QueryRmsDataTopksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsDataTopksResponse self = new QueryRmsDataTopksResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsDataTopksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsDataTopksResponse setBody(QueryRmsDataTopksResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsDataTopksResponseBody getBody() {
        return this.body;
    }

}
