// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateVideoResponseBody body;

    public static GenerateVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoResponse self = new GenerateVideoResponse();
        return TeaModel.build(map, self);
    }

    public GenerateVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateVideoResponse setBody(GenerateVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateVideoResponseBody getBody() {
        return this.body;
    }

}
