// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppcustomcijobbranchlogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAppcustomcijobbranchlogResponseBody body;

    public static QueryLinkeBahamutAppcustomcijobbranchlogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppcustomcijobbranchlogResponse self = new QueryLinkeBahamutAppcustomcijobbranchlogResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppcustomcijobbranchlogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAppcustomcijobbranchlogResponse setBody(QueryLinkeBahamutAppcustomcijobbranchlogResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAppcustomcijobbranchlogResponseBody getBody() {
        return this.body;
    }

}
