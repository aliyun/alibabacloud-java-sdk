// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class SetDeviceOtaAutoStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDeviceOtaAutoStatusResponseBody body;

    public static SetDeviceOtaAutoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceOtaAutoStatusResponse self = new SetDeviceOtaAutoStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetDeviceOtaAutoStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDeviceOtaAutoStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDeviceOtaAutoStatusResponse setBody(SetDeviceOtaAutoStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDeviceOtaAutoStatusResponseBody getBody() {
        return this.body;
    }

}
