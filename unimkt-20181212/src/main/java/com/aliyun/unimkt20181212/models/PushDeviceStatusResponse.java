// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class PushDeviceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushDeviceStatusResponseBody body;

    public static PushDeviceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        PushDeviceStatusResponse self = new PushDeviceStatusResponse();
        return TeaModel.build(map, self);
    }

    public PushDeviceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushDeviceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushDeviceStatusResponse setBody(PushDeviceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public PushDeviceStatusResponseBody getBody() {
        return this.body;
    }

}
