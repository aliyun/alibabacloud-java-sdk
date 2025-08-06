// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class FaceRegistrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FaceRegistrationResponseBody body;

    public static FaceRegistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceRegistrationResponse self = new FaceRegistrationResponse();
        return TeaModel.build(map, self);
    }

    public FaceRegistrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceRegistrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FaceRegistrationResponse setBody(FaceRegistrationResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceRegistrationResponseBody getBody() {
        return this.body;
    }

}
