// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GenerateKMSDataKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateKMSDataKeyResponseBody body;

    public static GenerateKMSDataKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateKMSDataKeyResponse self = new GenerateKMSDataKeyResponse();
        return TeaModel.build(map, self);
    }

    public GenerateKMSDataKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateKMSDataKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateKMSDataKeyResponse setBody(GenerateKMSDataKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateKMSDataKeyResponseBody getBody() {
        return this.body;
    }

}
