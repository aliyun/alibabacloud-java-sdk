// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutIterationResponseBody body;

    public static QueryLinkeBahamutIterationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationResponse self = new QueryLinkeBahamutIterationResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutIterationResponse setBody(QueryLinkeBahamutIterationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutIterationResponseBody getBody() {
        return this.body;
    }

}
