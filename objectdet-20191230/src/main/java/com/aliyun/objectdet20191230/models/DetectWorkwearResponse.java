// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectWorkwearResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectWorkwearResponseBody body;

    public static DetectWorkwearResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectWorkwearResponse self = new DetectWorkwearResponse();
        return TeaModel.build(map, self);
    }

    public DetectWorkwearResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectWorkwearResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectWorkwearResponse setBody(DetectWorkwearResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectWorkwearResponseBody getBody() {
        return this.body;
    }

}
