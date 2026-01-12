// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class AcceptAgreementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptAgreementResponseBody body;

    public static AcceptAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptAgreementResponse self = new AcceptAgreementResponse();
        return TeaModel.build(map, self);
    }

    public AcceptAgreementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptAgreementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptAgreementResponse setBody(AcceptAgreementResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptAgreementResponseBody getBody() {
        return this.body;
    }

}
