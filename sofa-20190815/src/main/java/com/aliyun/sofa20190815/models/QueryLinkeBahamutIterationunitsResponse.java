// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationunitsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutIterationunitsResponseBody body;

    public static QueryLinkeBahamutIterationunitsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationunitsResponse self = new QueryLinkeBahamutIterationunitsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationunitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutIterationunitsResponse setBody(QueryLinkeBahamutIterationunitsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutIterationunitsResponseBody getBody() {
        return this.body;
    }

}
