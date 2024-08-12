// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UpdateDeviceBindedEndUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDeviceBindedEndUserResponseBody body;

    public static UpdateDeviceBindedEndUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceBindedEndUserResponse self = new UpdateDeviceBindedEndUserResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceBindedEndUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeviceBindedEndUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeviceBindedEndUserResponse setBody(UpdateDeviceBindedEndUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeviceBindedEndUserResponseBody getBody() {
        return this.body;
    }

}
