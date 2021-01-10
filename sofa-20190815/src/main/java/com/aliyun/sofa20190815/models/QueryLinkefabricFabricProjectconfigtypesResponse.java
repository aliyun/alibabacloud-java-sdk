// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricProjectconfigtypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricProjectconfigtypesResponseBody body;

    public static QueryLinkefabricFabricProjectconfigtypesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricProjectconfigtypesResponse self = new QueryLinkefabricFabricProjectconfigtypesResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricProjectconfigtypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricProjectconfigtypesResponse setBody(QueryLinkefabricFabricProjectconfigtypesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricProjectconfigtypesResponseBody getBody() {
        return this.body;
    }

}
