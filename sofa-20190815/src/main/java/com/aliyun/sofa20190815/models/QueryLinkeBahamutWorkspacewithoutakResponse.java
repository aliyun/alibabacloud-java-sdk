// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWorkspacewithoutakResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutWorkspacewithoutakResponseBody body;

    public static QueryLinkeBahamutWorkspacewithoutakResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWorkspacewithoutakResponse self = new QueryLinkeBahamutWorkspacewithoutakResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWorkspacewithoutakResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutWorkspacewithoutakResponse setBody(QueryLinkeBahamutWorkspacewithoutakResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutWorkspacewithoutakResponseBody getBody() {
        return this.body;
    }

}
