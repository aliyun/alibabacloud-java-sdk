// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class UploadDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadDeviceResponseBody body;

    public static UploadDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadDeviceResponse self = new UploadDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UploadDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadDeviceResponse setBody(UploadDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadDeviceResponseBody getBody() {
        return this.body;
    }

}
