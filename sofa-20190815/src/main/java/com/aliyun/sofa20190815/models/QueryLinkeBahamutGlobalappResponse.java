// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutGlobalappResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutGlobalappResponseBody body;

    public static QueryLinkeBahamutGlobalappResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutGlobalappResponse self = new QueryLinkeBahamutGlobalappResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutGlobalappResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutGlobalappResponse setBody(QueryLinkeBahamutGlobalappResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutGlobalappResponseBody getBody() {
        return this.body;
    }

}
