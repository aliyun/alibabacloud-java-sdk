// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutUseraccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutUseraccountResponseBody body;

    public static QueryLinkeBahamutUseraccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutUseraccountResponse self = new QueryLinkeBahamutUseraccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutUseraccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutUseraccountResponse setBody(QueryLinkeBahamutUseraccountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutUseraccountResponseBody getBody() {
        return this.body;
    }

}
