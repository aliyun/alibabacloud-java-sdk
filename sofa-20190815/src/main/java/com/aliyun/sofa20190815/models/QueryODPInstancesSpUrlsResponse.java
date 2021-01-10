// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPInstancesSpUrlsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPInstancesSpUrlsResponseBody body;

    public static QueryODPInstancesSpUrlsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPInstancesSpUrlsResponse self = new QueryODPInstancesSpUrlsResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPInstancesSpUrlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPInstancesSpUrlsResponse setBody(QueryODPInstancesSpUrlsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPInstancesSpUrlsResponseBody getBody() {
        return this.body;
    }

}
