// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RemovePolarClawDevicePairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemovePolarClawDevicePairResponseBody body;

    public static RemovePolarClawDevicePairResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePolarClawDevicePairResponse self = new RemovePolarClawDevicePairResponse();
        return TeaModel.build(map, self);
    }

    public RemovePolarClawDevicePairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemovePolarClawDevicePairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemovePolarClawDevicePairResponse setBody(RemovePolarClawDevicePairResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePolarClawDevicePairResponseBody getBody() {
        return this.body;
    }

}
