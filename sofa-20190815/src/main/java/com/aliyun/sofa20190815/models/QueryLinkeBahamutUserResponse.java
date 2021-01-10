// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutUserResponseBody body;

    public static QueryLinkeBahamutUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutUserResponse self = new QueryLinkeBahamutUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutUserResponse setBody(QueryLinkeBahamutUserResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutUserResponseBody getBody() {
        return this.body;
    }

}
