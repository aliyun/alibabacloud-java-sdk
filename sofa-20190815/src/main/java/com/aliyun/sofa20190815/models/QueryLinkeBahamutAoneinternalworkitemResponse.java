// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneinternalworkitemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAoneinternalworkitemResponseBody body;

    public static QueryLinkeBahamutAoneinternalworkitemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneinternalworkitemResponse self = new QueryLinkeBahamutAoneinternalworkitemResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneinternalworkitemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAoneinternalworkitemResponse setBody(QueryLinkeBahamutAoneinternalworkitemResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAoneinternalworkitemResponseBody getBody() {
        return this.body;
    }

}
