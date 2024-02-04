// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class DisassociateResourceSharePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisassociateResourceSharePermissionResponseBody body;

    public static DisassociateResourceSharePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateResourceSharePermissionResponse self = new DisassociateResourceSharePermissionResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateResourceSharePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateResourceSharePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociateResourceSharePermissionResponse setBody(DisassociateResourceSharePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateResourceSharePermissionResponseBody getBody() {
        return this.body;
    }

}
