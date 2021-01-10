// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricAntxsystemcloudconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricAntxsystemcloudconfigResponseBody body;

    public static QueryLinkefabricFabricAntxsystemcloudconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricAntxsystemcloudconfigResponse self = new QueryLinkefabricFabricAntxsystemcloudconfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricAntxsystemcloudconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricAntxsystemcloudconfigResponse setBody(QueryLinkefabricFabricAntxsystemcloudconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricAntxsystemcloudconfigResponseBody getBody() {
        return this.body;
    }

}
