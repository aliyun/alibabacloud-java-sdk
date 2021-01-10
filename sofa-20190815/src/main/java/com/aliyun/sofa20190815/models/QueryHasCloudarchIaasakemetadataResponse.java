// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchIaasakemetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasCloudarchIaasakemetadataResponseBody body;

    public static QueryHasCloudarchIaasakemetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchIaasakemetadataResponse self = new QueryHasCloudarchIaasakemetadataResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchIaasakemetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasCloudarchIaasakemetadataResponse setBody(QueryHasCloudarchIaasakemetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasCloudarchIaasakemetadataResponseBody getBody() {
        return this.body;
    }

}
