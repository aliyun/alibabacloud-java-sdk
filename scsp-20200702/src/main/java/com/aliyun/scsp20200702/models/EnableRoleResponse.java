// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class EnableRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public EnableRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableRoleResponse setBody(EnableRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableRoleResponseBody getBody() {
        return this.body;
    }

}
