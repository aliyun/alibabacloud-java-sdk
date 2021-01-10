// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricReleaseconfigtypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricReleaseconfigtypesResponseBody body;

    public static QueryLinkefabricFabricReleaseconfigtypesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricReleaseconfigtypesResponse self = new QueryLinkefabricFabricReleaseconfigtypesResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricReleaseconfigtypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricReleaseconfigtypesResponse setBody(QueryLinkefabricFabricReleaseconfigtypesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricReleaseconfigtypesResponseBody getBody() {
        return this.body;
    }

}
