// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutRecommenditerationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutRecommenditerationResponseBody body;

    public static QueryLinkeBahamutRecommenditerationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutRecommenditerationResponse self = new QueryLinkeBahamutRecommenditerationResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutRecommenditerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutRecommenditerationResponse setBody(QueryLinkeBahamutRecommenditerationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutRecommenditerationResponseBody getBody() {
        return this.body;
    }

}
