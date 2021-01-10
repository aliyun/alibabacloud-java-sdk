// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneinternaliterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAoneinternaliterationResponseBody body;

    public static QueryLinkeBahamutAoneinternaliterationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneinternaliterationResponse self = new QueryLinkeBahamutAoneinternaliterationResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneinternaliterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAoneinternaliterationResponse setBody(QueryLinkeBahamutAoneinternaliterationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAoneinternaliterationResponseBody getBody() {
        return this.body;
    }

}
