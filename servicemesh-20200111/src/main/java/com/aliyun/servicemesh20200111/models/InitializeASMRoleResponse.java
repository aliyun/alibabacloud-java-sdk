// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class InitializeASMRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitializeASMRoleResponseBody body;

    public static InitializeASMRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeASMRoleResponse self = new InitializeASMRoleResponse();
        return TeaModel.build(map, self);
    }

    public InitializeASMRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeASMRoleResponse setBody(InitializeASMRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeASMRoleResponseBody getBody() {
        return this.body;
    }

}
