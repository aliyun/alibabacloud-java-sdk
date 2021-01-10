// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutIterationsResponseBody body;

    public static QueryLinkeBahamutIterationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationsResponse self = new QueryLinkeBahamutIterationsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutIterationsResponse setBody(QueryLinkeBahamutIterationsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutIterationsResponseBody getBody() {
        return this.body;
    }

}
