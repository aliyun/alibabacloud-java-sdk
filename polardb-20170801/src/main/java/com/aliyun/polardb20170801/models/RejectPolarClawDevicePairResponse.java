// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RejectPolarClawDevicePairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RejectPolarClawDevicePairResponseBody body;

    public static RejectPolarClawDevicePairResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectPolarClawDevicePairResponse self = new RejectPolarClawDevicePairResponse();
        return TeaModel.build(map, self);
    }

    public RejectPolarClawDevicePairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectPolarClawDevicePairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RejectPolarClawDevicePairResponse setBody(RejectPolarClawDevicePairResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectPolarClawDevicePairResponseBody getBody() {
        return this.body;
    }

}
