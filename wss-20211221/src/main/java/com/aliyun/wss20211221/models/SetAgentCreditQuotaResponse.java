// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class SetAgentCreditQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAgentCreditQuotaResponseBody body;

    public static SetAgentCreditQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAgentCreditQuotaResponse self = new SetAgentCreditQuotaResponse();
        return TeaModel.build(map, self);
    }

    public SetAgentCreditQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAgentCreditQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAgentCreditQuotaResponse setBody(SetAgentCreditQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAgentCreditQuotaResponseBody getBody() {
        return this.body;
    }

}
