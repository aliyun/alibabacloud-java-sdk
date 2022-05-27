// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeAccountPrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeAccountPrivilegeResponseBody body;

    public static RevokeAccountPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeAccountPrivilegeResponse self = new RevokeAccountPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public RevokeAccountPrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeAccountPrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeAccountPrivilegeResponse setBody(RevokeAccountPrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeAccountPrivilegeResponseBody getBody() {
        return this.body;
    }

}
