// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceOtaInfoTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceOtaInfoTestResponseBody body;

    public static GetDeviceOtaInfoTestResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOtaInfoTestResponse self = new GetDeviceOtaInfoTestResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceOtaInfoTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceOtaInfoTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceOtaInfoTestResponse setBody(GetDeviceOtaInfoTestResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceOtaInfoTestResponseBody getBody() {
        return this.body;
    }

}
