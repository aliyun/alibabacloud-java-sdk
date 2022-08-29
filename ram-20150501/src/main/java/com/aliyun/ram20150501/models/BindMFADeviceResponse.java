// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class BindMFADeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindMFADeviceResponseBody body;

    public static BindMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindMFADeviceResponse self = new BindMFADeviceResponse();
        return TeaModel.build(map, self);
    }

    public BindMFADeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindMFADeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindMFADeviceResponse setBody(BindMFADeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindMFADeviceResponseBody getBody() {
        return this.body;
    }

}
