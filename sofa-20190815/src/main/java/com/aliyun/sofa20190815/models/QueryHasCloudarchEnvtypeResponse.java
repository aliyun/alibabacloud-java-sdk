// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchEnvtypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasCloudarchEnvtypeResponseBody body;

    public static QueryHasCloudarchEnvtypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchEnvtypeResponse self = new QueryHasCloudarchEnvtypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchEnvtypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasCloudarchEnvtypeResponse setBody(QueryHasCloudarchEnvtypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasCloudarchEnvtypeResponseBody getBody() {
        return this.body;
    }

}
