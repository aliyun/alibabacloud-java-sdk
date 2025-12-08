// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateVirtualClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVirtualClusterResponseBody body;

    public static CreateVirtualClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualClusterResponse self = new CreateVirtualClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirtualClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVirtualClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVirtualClusterResponse setBody(CreateVirtualClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVirtualClusterResponseBody getBody() {
        return this.body;
    }

}
