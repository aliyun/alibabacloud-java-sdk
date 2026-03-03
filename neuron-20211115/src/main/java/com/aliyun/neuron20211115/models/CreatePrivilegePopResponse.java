// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePrivilegePopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePrivilegePopResponseBody body;

    public static CreatePrivilegePopResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivilegePopResponse self = new CreatePrivilegePopResponse();
        return TeaModel.build(map, self);
    }

    public CreatePrivilegePopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePrivilegePopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePrivilegePopResponse setBody(CreatePrivilegePopResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePrivilegePopResponseBody getBody() {
        return this.body;
    }

}
