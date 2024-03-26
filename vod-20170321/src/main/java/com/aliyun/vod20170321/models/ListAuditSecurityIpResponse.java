// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAuditSecurityIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListAuditSecurityIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuditSecurityIpResponse setBody(ListAuditSecurityIpResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuditSecurityIpResponseBody getBody() {
        return this.body;
    }

}
