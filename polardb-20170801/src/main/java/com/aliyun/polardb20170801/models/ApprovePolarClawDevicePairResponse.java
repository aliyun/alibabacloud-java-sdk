// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ApprovePolarClawDevicePairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApprovePolarClawDevicePairResponseBody body;

    public static ApprovePolarClawDevicePairResponse build(java.util.Map<String, ?> map) throws Exception {
        ApprovePolarClawDevicePairResponse self = new ApprovePolarClawDevicePairResponse();
        return TeaModel.build(map, self);
    }

    public ApprovePolarClawDevicePairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApprovePolarClawDevicePairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApprovePolarClawDevicePairResponse setBody(ApprovePolarClawDevicePairResponseBody body) {
        this.body = body;
        return this;
    }
    public ApprovePolarClawDevicePairResponseBody getBody() {
        return this.body;
    }

}
