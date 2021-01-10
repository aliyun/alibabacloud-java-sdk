// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchIaasmetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasCloudarchIaasmetadataResponseBody body;

    public static QueryHasCloudarchIaasmetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchIaasmetadataResponse self = new QueryHasCloudarchIaasmetadataResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchIaasmetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasCloudarchIaasmetadataResponse setBody(QueryHasCloudarchIaasmetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasCloudarchIaasmetadataResponseBody getBody() {
        return this.body;
    }

}
