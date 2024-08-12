// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceOtaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceOtaInfoResponseBody body;

    public static GetDeviceOtaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOtaInfoResponse self = new GetDeviceOtaInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceOtaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceOtaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceOtaInfoResponse setBody(GetDeviceOtaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceOtaInfoResponseBody getBody() {
        return this.body;
    }

}
