// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DisassociateACLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisassociateACLResponseBody body;

    public static DisassociateACLResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateACLResponse self = new DisassociateACLResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateACLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateACLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociateACLResponse setBody(DisassociateACLResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateACLResponseBody getBody() {
        return this.body;
    }

}
