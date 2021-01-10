// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutUsersResponseBody body;

    public static QueryLinkeBahamutUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutUsersResponse self = new QueryLinkeBahamutUsersResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutUsersResponse setBody(QueryLinkeBahamutUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutUsersResponseBody getBody() {
        return this.body;
    }

}
