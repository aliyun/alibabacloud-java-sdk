// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceOtaTaskVersionInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceOtaTaskVersionInfoResponseBody body;

    public static GetDeviceOtaTaskVersionInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOtaTaskVersionInfoResponse self = new GetDeviceOtaTaskVersionInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceOtaTaskVersionInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceOtaTaskVersionInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceOtaTaskVersionInfoResponse setBody(GetDeviceOtaTaskVersionInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceOtaTaskVersionInfoResponseBody getBody() {
        return this.body;
    }

}
