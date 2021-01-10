// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchWorkspacegroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasCloudarchWorkspacegroupResponseBody body;

    public static QueryHasCloudarchWorkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchWorkspacegroupResponse self = new QueryHasCloudarchWorkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchWorkspacegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasCloudarchWorkspacegroupResponse setBody(QueryHasCloudarchWorkspacegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasCloudarchWorkspacegroupResponseBody getBody() {
        return this.body;
    }

}
