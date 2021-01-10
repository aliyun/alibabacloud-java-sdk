// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutSandboxdeployResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutSandboxdeployResponseBody body;

    public static QueryLinkeBahamutSandboxdeployResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutSandboxdeployResponse self = new QueryLinkeBahamutSandboxdeployResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutSandboxdeployResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutSandboxdeployResponse setBody(QueryLinkeBahamutSandboxdeployResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutSandboxdeployResponseBody getBody() {
        return this.body;
    }

}
