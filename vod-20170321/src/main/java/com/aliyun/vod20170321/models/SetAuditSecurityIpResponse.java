// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetAuditSecurityIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetAuditSecurityIpResponse setBody(SetAuditSecurityIpResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAuditSecurityIpResponseBody getBody() {
        return this.body;
    }

}
