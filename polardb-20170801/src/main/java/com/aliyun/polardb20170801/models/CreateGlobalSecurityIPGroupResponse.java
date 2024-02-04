// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateGlobalSecurityIPGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGlobalSecurityIPGroupResponseBody body;

    public static CreateGlobalSecurityIPGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalSecurityIPGroupResponse self = new CreateGlobalSecurityIPGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateGlobalSecurityIPGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGlobalSecurityIPGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGlobalSecurityIPGroupResponse setBody(CreateGlobalSecurityIPGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGlobalSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

}
