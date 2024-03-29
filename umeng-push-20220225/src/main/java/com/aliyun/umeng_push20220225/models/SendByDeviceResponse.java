// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendByDeviceResponseBody body;

    public static SendByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        SendByDeviceResponse self = new SendByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public SendByDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendByDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendByDeviceResponse setBody(SendByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public SendByDeviceResponseBody getBody() {
        return this.body;
    }

}
