// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationdetachreleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutIterationdetachreleaseResponseBody body;

    public static QueryLinkeBahamutIterationdetachreleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationdetachreleaseResponse self = new QueryLinkeBahamutIterationdetachreleaseResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationdetachreleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutIterationdetachreleaseResponse setBody(QueryLinkeBahamutIterationdetachreleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutIterationdetachreleaseResponseBody getBody() {
        return this.body;
    }

}
