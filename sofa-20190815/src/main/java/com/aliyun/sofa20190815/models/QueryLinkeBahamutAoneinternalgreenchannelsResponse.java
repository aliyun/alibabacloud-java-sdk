// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneinternalgreenchannelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAoneinternalgreenchannelsResponseBody body;

    public static QueryLinkeBahamutAoneinternalgreenchannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneinternalgreenchannelsResponse self = new QueryLinkeBahamutAoneinternalgreenchannelsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneinternalgreenchannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAoneinternalgreenchannelsResponse setBody(QueryLinkeBahamutAoneinternalgreenchannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAoneinternalgreenchannelsResponseBody getBody() {
        return this.body;
    }

}
