// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class SetDeviceOtaTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDeviceOtaTaskStatusResponseBody body;

    public static SetDeviceOtaTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceOtaTaskStatusResponse self = new SetDeviceOtaTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetDeviceOtaTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDeviceOtaTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDeviceOtaTaskStatusResponse setBody(SetDeviceOtaTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDeviceOtaTaskStatusResponseBody getBody() {
        return this.body;
    }

}
