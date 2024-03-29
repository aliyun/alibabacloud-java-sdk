// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByDeviceFileIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendByDeviceFileIdResponseBody body;

    public static SendByDeviceFileIdResponse build(java.util.Map<String, ?> map) throws Exception {
        SendByDeviceFileIdResponse self = new SendByDeviceFileIdResponse();
        return TeaModel.build(map, self);
    }

    public SendByDeviceFileIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendByDeviceFileIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendByDeviceFileIdResponse setBody(SendByDeviceFileIdResponseBody body) {
        this.body = body;
        return this;
    }
    public SendByDeviceFileIdResponseBody getBody() {
        return this.body;
    }

}
