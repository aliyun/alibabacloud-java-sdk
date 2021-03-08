// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAuditSecurityIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuditSecurityIpResponseBody body;

    public static ListAuditSecurityIpResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuditSecurityIpResponse self = new ListAuditSecurityIpResponse();
        return TeaModel.build(map, self);
    }

    public ListAuditSecurityIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuditSecurityIpResponse setBody(ListAuditSecurityIpResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuditSecurityIpResponseBody getBody() {
        return this.body;
    }

}
