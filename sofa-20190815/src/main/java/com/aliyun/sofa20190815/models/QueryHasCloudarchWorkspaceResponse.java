// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasCloudarchWorkspaceResponseBody body;

    public static QueryHasCloudarchWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchWorkspaceResponse self = new QueryHasCloudarchWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasCloudarchWorkspaceResponse setBody(QueryHasCloudarchWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasCloudarchWorkspaceResponseBody getBody() {
        return this.body;
    }

}
