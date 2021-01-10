// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricMsgtypeinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricMsgtypeinfoResponseBody body;

    public static QueryLinkefabricFabricMsgtypeinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricMsgtypeinfoResponse self = new QueryLinkefabricFabricMsgtypeinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricMsgtypeinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricMsgtypeinfoResponse setBody(QueryLinkefabricFabricMsgtypeinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricMsgtypeinfoResponseBody getBody() {
        return this.body;
    }

}
