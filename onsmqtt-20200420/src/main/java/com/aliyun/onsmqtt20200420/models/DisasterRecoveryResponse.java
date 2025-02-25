// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DisasterRecoveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisasterRecoveryResponseBody body;

    public static DisasterRecoveryResponse build(java.util.Map<String, ?> map) throws Exception {
        DisasterRecoveryResponse self = new DisasterRecoveryResponse();
        return TeaModel.build(map, self);
    }

    public DisasterRecoveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisasterRecoveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisasterRecoveryResponse setBody(DisasterRecoveryResponseBody body) {
        this.body = body;
        return this;
    }
    public DisasterRecoveryResponseBody getBody() {
        return this.body;
    }

}
