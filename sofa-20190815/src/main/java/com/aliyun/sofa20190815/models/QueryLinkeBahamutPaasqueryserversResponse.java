// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutPaasqueryserversResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutPaasqueryserversResponseBody body;

    public static QueryLinkeBahamutPaasqueryserversResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutPaasqueryserversResponse self = new QueryLinkeBahamutPaasqueryserversResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutPaasqueryserversResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutPaasqueryserversResponse setBody(QueryLinkeBahamutPaasqueryserversResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutPaasqueryserversResponseBody getBody() {
        return this.body;
    }

}
