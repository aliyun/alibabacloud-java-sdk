// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectusedstatusesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktProjectusedstatusesResponseBody body;

    public static QueryLinkeLinktProjectusedstatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectusedstatusesResponse self = new QueryLinkeLinktProjectusedstatusesResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectusedstatusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktProjectusedstatusesResponse setBody(QueryLinkeLinktProjectusedstatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktProjectusedstatusesResponseBody getBody() {
        return this.body;
    }

}
