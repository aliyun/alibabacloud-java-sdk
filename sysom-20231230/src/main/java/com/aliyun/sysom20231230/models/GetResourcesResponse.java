// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourcesResponseBody body;

    public static GetResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourcesResponse self = new GetResourcesResponse();
        return TeaModel.build(map, self);
    }

    public GetResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourcesResponse setBody(GetResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourcesResponseBody getBody() {
        return this.body;
    }

}
