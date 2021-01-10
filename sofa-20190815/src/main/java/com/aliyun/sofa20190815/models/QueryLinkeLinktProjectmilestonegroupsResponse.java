// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectmilestonegroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktProjectmilestonegroupsResponseBody body;

    public static QueryLinkeLinktProjectmilestonegroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectmilestonegroupsResponse self = new QueryLinkeLinktProjectmilestonegroupsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectmilestonegroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktProjectmilestonegroupsResponse setBody(QueryLinkeLinktProjectmilestonegroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktProjectmilestonegroupsResponseBody getBody() {
        return this.body;
    }

}
