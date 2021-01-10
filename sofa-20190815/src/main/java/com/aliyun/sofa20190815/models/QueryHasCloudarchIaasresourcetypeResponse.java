// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchIaasresourcetypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasCloudarchIaasresourcetypeResponseBody body;

    public static QueryHasCloudarchIaasresourcetypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchIaasresourcetypeResponse self = new QueryHasCloudarchIaasresourcetypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchIaasresourcetypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasCloudarchIaasresourcetypeResponse setBody(QueryHasCloudarchIaasresourcetypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasCloudarchIaasresourcetypeResponseBody getBody() {
        return this.body;
    }

}
