// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationunitbatchnextstageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutIterationunitbatchnextstageResponseBody body;

    public static QueryLinkeBahamutIterationunitbatchnextstageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationunitbatchnextstageResponse self = new QueryLinkeBahamutIterationunitbatchnextstageResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationunitbatchnextstageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutIterationunitbatchnextstageResponse setBody(QueryLinkeBahamutIterationunitbatchnextstageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutIterationunitbatchnextstageResponseBody getBody() {
        return this.body;
    }

}
