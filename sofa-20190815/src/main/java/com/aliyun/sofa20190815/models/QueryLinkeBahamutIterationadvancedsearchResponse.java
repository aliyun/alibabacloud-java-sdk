// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationadvancedsearchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutIterationadvancedsearchResponseBody body;

    public static QueryLinkeBahamutIterationadvancedsearchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationadvancedsearchResponse self = new QueryLinkeBahamutIterationadvancedsearchResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationadvancedsearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutIterationadvancedsearchResponse setBody(QueryLinkeBahamutIterationadvancedsearchResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutIterationadvancedsearchResponseBody getBody() {
        return this.body;
    }

}
