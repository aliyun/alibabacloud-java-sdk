// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricMsgconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricMsgconfigResponseBody body;

    public static QueryLinkefabricFabricMsgconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricMsgconfigResponse self = new QueryLinkefabricFabricMsgconfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricMsgconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricMsgconfigResponse setBody(QueryLinkefabricFabricMsgconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricMsgconfigResponseBody getBody() {
        return this.body;
    }

}
