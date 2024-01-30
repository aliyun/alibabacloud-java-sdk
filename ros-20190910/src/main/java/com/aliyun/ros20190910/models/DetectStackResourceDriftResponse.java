// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackResourceDriftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectStackResourceDriftResponseBody body;

    public static DetectStackResourceDriftResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectStackResourceDriftResponse self = new DetectStackResourceDriftResponse();
        return TeaModel.build(map, self);
    }

    public DetectStackResourceDriftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectStackResourceDriftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectStackResourceDriftResponse setBody(DetectStackResourceDriftResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectStackResourceDriftResponseBody getBody() {
        return this.body;
    }

}
