// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricMsgbinginginfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricMsgbinginginfoResponseBody body;

    public static QueryLinkefabricFabricMsgbinginginfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricMsgbinginginfoResponse self = new QueryLinkefabricFabricMsgbinginginfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricMsgbinginginfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricMsgbinginginfoResponse setBody(QueryLinkefabricFabricMsgbinginginfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricMsgbinginginfoResponseBody getBody() {
        return this.body;
    }

}
