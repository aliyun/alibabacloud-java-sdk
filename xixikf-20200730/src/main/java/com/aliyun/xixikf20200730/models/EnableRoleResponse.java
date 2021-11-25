// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class EnableRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableRoleResponseBody body;

    public static EnableRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableRoleResponse self = new EnableRoleResponse();
        return TeaModel.build(map, self);
    }

    public EnableRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableRoleResponse setBody(EnableRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableRoleResponseBody getBody() {
        return this.body;
    }

}
