// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateDeviceAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeviceAlarmResponseBody body;

    public static CreateDeviceAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceAlarmResponse self = new CreateDeviceAlarmResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeviceAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeviceAlarmResponse setBody(CreateDeviceAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeviceAlarmResponseBody getBody() {
        return this.body;
    }

}
