// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackDriftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectStackDriftResponseBody body;

    public static DetectStackDriftResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectStackDriftResponse self = new DetectStackDriftResponse();
        return TeaModel.build(map, self);
    }

    public DetectStackDriftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectStackDriftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectStackDriftResponse setBody(DetectStackDriftResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectStackDriftResponseBody getBody() {
        return this.body;
    }

}
