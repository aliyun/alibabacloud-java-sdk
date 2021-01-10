// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutWebapisandboxdeploybyreleaseResponseBody body;

    public static QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse self = new QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutWebapisandboxdeploybyreleaseResponse setBody(QueryLinkeBahamutWebapisandboxdeploybyreleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutWebapisandboxdeploybyreleaseResponseBody getBody() {
        return this.body;
    }

}
