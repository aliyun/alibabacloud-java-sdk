// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutProjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutProjectsResponseBody body;

    public static QueryLinkeBahamutProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutProjectsResponse self = new QueryLinkeBahamutProjectsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutProjectsResponse setBody(QueryLinkeBahamutProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutProjectsResponseBody getBody() {
        return this.body;
    }

}
