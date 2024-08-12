// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceOtaAutoStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceOtaAutoStatusResponseBody body;

    public static GetDeviceOtaAutoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOtaAutoStatusResponse self = new GetDeviceOtaAutoStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceOtaAutoStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceOtaAutoStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceOtaAutoStatusResponse setBody(GetDeviceOtaAutoStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceOtaAutoStatusResponseBody getBody() {
        return this.body;
    }

}
