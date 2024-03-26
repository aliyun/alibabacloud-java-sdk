// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetAuditSecurityIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAuditSecurityIpResponseBody body;

    public static SetAuditSecurityIpResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAuditSecurityIpResponse self = new SetAuditSecurityIpResponse();
        return TeaModel.build(map, self);
    }

    public SetAuditSecurityIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAuditSecurityIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAuditSecurityIpResponse setBody(SetAuditSecurityIpResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAuditSecurityIpResponseBody getBody() {
        return this.body;
    }

}
