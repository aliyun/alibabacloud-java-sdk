// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutPaasapplyserversResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutPaasapplyserversResponseBody body;

    public static QueryLinkeBahamutPaasapplyserversResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutPaasapplyserversResponse self = new QueryLinkeBahamutPaasapplyserversResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutPaasapplyserversResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutPaasapplyserversResponse setBody(QueryLinkeBahamutPaasapplyserversResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutPaasapplyserversResponseBody getBody() {
        return this.body;
    }

}
