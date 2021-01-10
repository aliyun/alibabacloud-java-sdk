// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktSimpleprojectmembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeLinktSimpleprojectmembersResponseBody body;

    public static QueryLinkeLinktSimpleprojectmembersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktSimpleprojectmembersResponse self = new QueryLinkeLinktSimpleprojectmembersResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktSimpleprojectmembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeLinktSimpleprojectmembersResponse setBody(QueryLinkeLinktSimpleprojectmembersResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeLinktSimpleprojectmembersResponseBody getBody() {
        return this.body;
    }

}
