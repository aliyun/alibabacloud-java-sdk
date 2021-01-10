// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutLinketenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutLinketenantResponseBody body;

    public static QueryLinkeBahamutLinketenantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutLinketenantResponse self = new QueryLinkeBahamutLinketenantResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutLinketenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutLinketenantResponse setBody(QueryLinkeBahamutLinketenantResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutLinketenantResponseBody getBody() {
        return this.body;
    }

}
