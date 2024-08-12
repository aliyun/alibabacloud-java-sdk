// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GenerateOssUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateOssUrlResponseBody body;

    public static GenerateOssUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateOssUrlResponse self = new GenerateOssUrlResponse();
        return TeaModel.build(map, self);
    }

    public GenerateOssUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateOssUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateOssUrlResponse setBody(GenerateOssUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateOssUrlResponseBody getBody() {
        return this.body;
    }

}
