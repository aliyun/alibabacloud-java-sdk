// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutAppResponseBody body;

    public static QueryLinkeBahamutAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppResponse self = new QueryLinkeBahamutAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutAppResponse setBody(QueryLinkeBahamutAppResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutAppResponseBody getBody() {
        return this.body;
    }

}
