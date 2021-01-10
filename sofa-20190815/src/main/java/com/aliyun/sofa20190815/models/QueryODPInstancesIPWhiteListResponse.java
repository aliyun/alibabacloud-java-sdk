// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPInstancesIPWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPInstancesIPWhiteListResponseBody body;

    public static QueryODPInstancesIPWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPInstancesIPWhiteListResponse self = new QueryODPInstancesIPWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPInstancesIPWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPInstancesIPWhiteListResponse setBody(QueryODPInstancesIPWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPInstancesIPWhiteListResponseBody getBody() {
        return this.body;
    }

}
