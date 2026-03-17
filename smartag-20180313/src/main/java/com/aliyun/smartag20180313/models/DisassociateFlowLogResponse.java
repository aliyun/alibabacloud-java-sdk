// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DisassociateFlowLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisassociateFlowLogResponseBody body;

    public static DisassociateFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DisassociateFlowLogResponse self = new DisassociateFlowLogResponse();
        return TeaModel.build(map, self);
    }

    public DisassociateFlowLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisassociateFlowLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisassociateFlowLogResponse setBody(DisassociateFlowLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DisassociateFlowLogResponseBody getBody() {
        return this.body;
    }

}
