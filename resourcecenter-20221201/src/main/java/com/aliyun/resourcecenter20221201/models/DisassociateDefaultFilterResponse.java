// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DisassociateDefaultFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisassociateDefaultFilterResponseBody body;

    public static DisassociateDefaultFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateDefaultFilterResponse self = new DisassociateDefaultFilterResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateDefaultFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateDefaultFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociateDefaultFilterResponse setBody(DisassociateDefaultFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateDefaultFilterResponseBody getBody() {
        return this.body;
    }

}
