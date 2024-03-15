// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateDBClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDBClusterResponseBody body;

    public static CreateDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterResponse self = new CreateDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBClusterResponse setBody(CreateDBClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBClusterResponseBody getBody() {
        return this.body;
    }

}
