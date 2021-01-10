// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutDelbasejarmoduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutDelbasejarmoduleResponseBody body;

    public static QueryLinkeBahamutDelbasejarmoduleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutDelbasejarmoduleResponse self = new QueryLinkeBahamutDelbasejarmoduleResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutDelbasejarmoduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutDelbasejarmoduleResponse setBody(QueryLinkeBahamutDelbasejarmoduleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutDelbasejarmoduleResponseBody getBody() {
        return this.body;
    }

}
