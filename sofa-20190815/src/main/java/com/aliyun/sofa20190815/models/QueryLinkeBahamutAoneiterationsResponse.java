// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneiterationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAoneiterationsResponseBody body;

    public static QueryLinkeBahamutAoneiterationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneiterationsResponse self = new QueryLinkeBahamutAoneiterationsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneiterationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAoneiterationsResponse setBody(QueryLinkeBahamutAoneiterationsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAoneiterationsResponseBody getBody() {
        return this.body;
    }

}
