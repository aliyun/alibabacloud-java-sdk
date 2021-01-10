// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBody body;

    public static QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse self = new QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponse setBody(QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBody getBody() {
        return this.body;
    }

}
