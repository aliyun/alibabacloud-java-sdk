// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectIPCObjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectIPCObjectResponseBody body;

    public static DetectIPCObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCObjectResponse self = new DetectIPCObjectResponse();
        return TeaModel.build(map, self);
    }

    public DetectIPCObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectIPCObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectIPCObjectResponse setBody(DetectIPCObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectIPCObjectResponseBody getBody() {
        return this.body;
    }

}
