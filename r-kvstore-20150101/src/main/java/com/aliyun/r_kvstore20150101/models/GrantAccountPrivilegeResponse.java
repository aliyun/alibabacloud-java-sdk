// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class GrantAccountPrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantAccountPrivilegeResponseBody body;

    public static GrantAccountPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantAccountPrivilegeResponse self = new GrantAccountPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public GrantAccountPrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantAccountPrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantAccountPrivilegeResponse setBody(GrantAccountPrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantAccountPrivilegeResponseBody getBody() {
        return this.body;
    }

}
