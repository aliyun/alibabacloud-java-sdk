// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DisassociateSourceServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisassociateSourceServersResponseBody body;

    public static DisassociateSourceServersResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateSourceServersResponse self = new DisassociateSourceServersResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateSourceServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateSourceServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociateSourceServersResponse setBody(DisassociateSourceServersResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateSourceServersResponseBody getBody() {
        return this.body;
    }

}
