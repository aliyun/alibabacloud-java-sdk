// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutGlobalreleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutGlobalreleaseResponseBody body;

    public static QueryLinkeBahamutGlobalreleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutGlobalreleaseResponse self = new QueryLinkeBahamutGlobalreleaseResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutGlobalreleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutGlobalreleaseResponse setBody(QueryLinkeBahamutGlobalreleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutGlobalreleaseResponseBody getBody() {
        return this.body;
    }

}
