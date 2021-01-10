// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCiprojectbyappnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricCiprojectbyappnameResponseBody body;

    public static QueryLinkefabricFabricCiprojectbyappnameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCiprojectbyappnameResponse self = new QueryLinkefabricFabricCiprojectbyappnameResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCiprojectbyappnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricCiprojectbyappnameResponse setBody(QueryLinkefabricFabricCiprojectbyappnameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricCiprojectbyappnameResponseBody getBody() {
        return this.body;
    }

}
