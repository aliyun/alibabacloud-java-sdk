// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectmembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktProjectmembersResponseBody body;

    public static QueryLinkeLinktProjectmembersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectmembersResponse self = new QueryLinkeLinktProjectmembersResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectmembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktProjectmembersResponse setBody(QueryLinkeLinktProjectmembersResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktProjectmembersResponseBody getBody() {
        return this.body;
    }

}
