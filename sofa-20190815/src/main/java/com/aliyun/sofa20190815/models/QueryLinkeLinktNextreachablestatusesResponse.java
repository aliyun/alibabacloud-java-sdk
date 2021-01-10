// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktNextreachablestatusesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktNextreachablestatusesResponseBody body;

    public static QueryLinkeLinktNextreachablestatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktNextreachablestatusesResponse self = new QueryLinkeLinktNextreachablestatusesResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktNextreachablestatusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktNextreachablestatusesResponse setBody(QueryLinkeLinktNextreachablestatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktNextreachablestatusesResponseBody getBody() {
        return this.body;
    }

}
