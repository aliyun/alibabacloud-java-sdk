// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAntcloudappResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAntcloudappResponseBody body;

    public static QueryLinkeBahamutAntcloudappResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAntcloudappResponse self = new QueryLinkeBahamutAntcloudappResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAntcloudappResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAntcloudappResponse setBody(QueryLinkeBahamutAntcloudappResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAntcloudappResponseBody getBody() {
        return this.body;
    }

}
