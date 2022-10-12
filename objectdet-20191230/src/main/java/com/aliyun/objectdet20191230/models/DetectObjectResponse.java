// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectObjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectObjectResponseBody body;

    public static DetectObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectObjectResponse self = new DetectObjectResponse();
        return TeaModel.build(map, self);
    }

    public DetectObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectObjectResponse setBody(DetectObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectObjectResponseBody getBody() {
        return this.body;
    }

}
