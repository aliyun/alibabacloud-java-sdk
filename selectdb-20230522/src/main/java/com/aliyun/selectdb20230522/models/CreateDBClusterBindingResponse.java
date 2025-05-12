// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateDBClusterBindingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDBClusterBindingResponseBody body;

    public static CreateDBClusterBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterBindingResponse self = new CreateDBClusterBindingResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBClusterBindingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBClusterBindingResponse setBody(CreateDBClusterBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBClusterBindingResponseBody getBody() {
        return this.body;
    }

}
