// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RevokeAccountPrivilegeZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeAccountPrivilegeZonalResponseBody body;

    public static RevokeAccountPrivilegeZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeAccountPrivilegeZonalResponse self = new RevokeAccountPrivilegeZonalResponse();
        return TeaModel.build(map, self);
    }

    public RevokeAccountPrivilegeZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeAccountPrivilegeZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeAccountPrivilegeZonalResponse setBody(RevokeAccountPrivilegeZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeAccountPrivilegeZonalResponseBody getBody() {
        return this.body;
    }

}
