// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateClusterResponseBody body;

    public static CreateClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterResponse self = new CreateClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateClusterResponse setBody(CreateClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClusterResponseBody getBody() {
        return this.body;
    }

}
