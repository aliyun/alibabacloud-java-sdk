// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GrantAccountPrivilegeZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantAccountPrivilegeZonalResponseBody body;

    public static GrantAccountPrivilegeZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantAccountPrivilegeZonalResponse self = new GrantAccountPrivilegeZonalResponse();
        return TeaModel.build(map, self);
    }

    public GrantAccountPrivilegeZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantAccountPrivilegeZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantAccountPrivilegeZonalResponse setBody(GrantAccountPrivilegeZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantAccountPrivilegeZonalResponseBody getBody() {
        return this.body;
    }

}
