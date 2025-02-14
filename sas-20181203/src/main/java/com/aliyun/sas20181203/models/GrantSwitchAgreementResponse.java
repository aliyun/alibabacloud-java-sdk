// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GrantSwitchAgreementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantSwitchAgreementResponseBody body;

    public static GrantSwitchAgreementResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantSwitchAgreementResponse self = new GrantSwitchAgreementResponse();
        return TeaModel.build(map, self);
    }

    public GrantSwitchAgreementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantSwitchAgreementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantSwitchAgreementResponse setBody(GrantSwitchAgreementResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantSwitchAgreementResponseBody getBody() {
        return this.body;
    }

}
