// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppcustomcijoblogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAppcustomcijoblogResponseBody body;

    public static QueryLinkeBahamutAppcustomcijoblogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppcustomcijoblogResponse self = new QueryLinkeBahamutAppcustomcijoblogResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppcustomcijoblogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAppcustomcijoblogResponse setBody(QueryLinkeBahamutAppcustomcijoblogResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAppcustomcijoblogResponseBody getBody() {
        return this.body;
    }

}
