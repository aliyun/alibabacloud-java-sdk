// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppssearchliteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAppssearchliteResponseBody body;

    public static QueryLinkeBahamutAppssearchliteResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppssearchliteResponse self = new QueryLinkeBahamutAppssearchliteResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppssearchliteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAppssearchliteResponse setBody(QueryLinkeBahamutAppssearchliteResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAppssearchliteResponseBody getBody() {
        return this.body;
    }

}
