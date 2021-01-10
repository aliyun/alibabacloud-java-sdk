// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricNewappinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricNewappinfoResponseBody body;

    public static QueryLinkefabricFabricNewappinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricNewappinfoResponse self = new QueryLinkefabricFabricNewappinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricNewappinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricNewappinfoResponse setBody(QueryLinkefabricFabricNewappinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricNewappinfoResponseBody getBody() {
        return this.body;
    }

}
