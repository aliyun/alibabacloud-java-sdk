// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class AssociateSourceServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateSourceServersResponseBody body;

    public static AssociateSourceServersResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateSourceServersResponse self = new AssociateSourceServersResponse();
        return TeaModel.build(map, self);
    }

    public AssociateSourceServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateSourceServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateSourceServersResponse setBody(AssociateSourceServersResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateSourceServersResponseBody getBody() {
        return this.body;
    }

}
