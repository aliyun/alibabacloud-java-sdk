// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDeviceResponseBody body;

    public static UpdateDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceResponse self = new UpdateDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeviceResponse setBody(UpdateDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeviceResponseBody getBody() {
        return this.body;
    }

}
