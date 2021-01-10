// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutReleasesandboxdeployResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutReleasesandboxdeployResponseBody body;

    public static QueryLinkeBahamutReleasesandboxdeployResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutReleasesandboxdeployResponse self = new QueryLinkeBahamutReleasesandboxdeployResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutReleasesandboxdeployResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutReleasesandboxdeployResponse setBody(QueryLinkeBahamutReleasesandboxdeployResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutReleasesandboxdeployResponseBody getBody() {
        return this.body;
    }

}
