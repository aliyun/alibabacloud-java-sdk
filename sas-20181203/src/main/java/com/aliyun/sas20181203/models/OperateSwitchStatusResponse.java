// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSwitchStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateSwitchStatusResponseBody body;

    public static OperateSwitchStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateSwitchStatusResponse self = new OperateSwitchStatusResponse();
        return TeaModel.build(map, self);
    }

    public OperateSwitchStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateSwitchStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateSwitchStatusResponse setBody(OperateSwitchStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateSwitchStatusResponseBody getBody() {
        return this.body;
    }

}
