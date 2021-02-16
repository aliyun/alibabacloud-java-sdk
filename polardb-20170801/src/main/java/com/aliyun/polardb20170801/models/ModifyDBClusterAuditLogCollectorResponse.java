// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAuditLogCollectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterAuditLogCollectorResponseBody body;

    public static ModifyDBClusterAuditLogCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAuditLogCollectorResponse self = new ModifyDBClusterAuditLogCollectorResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAuditLogCollectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterAuditLogCollectorResponse setBody(ModifyDBClusterAuditLogCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterAuditLogCollectorResponseBody getBody() {
        return this.body;
    }

}
