// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class DisassociateResourceShareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisassociateResourceShareResponseBody body;

    public static DisassociateResourceShareResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateResourceShareResponse self = new DisassociateResourceShareResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateResourceShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateResourceShareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociateResourceShareResponse setBody(DisassociateResourceShareResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateResourceShareResponseBody getBody() {
        return this.body;
    }

}
