// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutReleaserollbacktagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutReleaserollbacktagResponseBody body;

    public static QueryLinkeBahamutReleaserollbacktagResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutReleaserollbacktagResponse self = new QueryLinkeBahamutReleaserollbacktagResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutReleaserollbacktagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutReleaserollbacktagResponse setBody(QueryLinkeBahamutReleaserollbacktagResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutReleaserollbacktagResponseBody getBody() {
        return this.body;
    }

}
