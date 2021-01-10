// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutSandboxdeploycheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutSandboxdeploycheckResponseBody body;

    public static QueryLinkeBahamutSandboxdeploycheckResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutSandboxdeploycheckResponse self = new QueryLinkeBahamutSandboxdeploycheckResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutSandboxdeploycheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutSandboxdeploycheckResponse setBody(QueryLinkeBahamutSandboxdeploycheckResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutSandboxdeploycheckResponseBody getBody() {
        return this.body;
    }

}
