// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppcustomcijobbranchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAppcustomcijobbranchResponseBody body;

    public static QueryLinkeBahamutAppcustomcijobbranchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppcustomcijobbranchResponse self = new QueryLinkeBahamutAppcustomcijobbranchResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppcustomcijobbranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAppcustomcijobbranchResponse setBody(QueryLinkeBahamutAppcustomcijobbranchResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAppcustomcijobbranchResponseBody getBody() {
        return this.body;
    }

}
