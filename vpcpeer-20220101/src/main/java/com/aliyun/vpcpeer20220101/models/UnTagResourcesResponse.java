// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class UnTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnTagResourcesResponseBody body;

    public static UnTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourcesResponse self = new UnTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UnTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnTagResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnTagResourcesResponse setBody(UnTagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UnTagResourcesResponseBody getBody() {
        return this.body;
    }

}
