// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GenerateDownloadSecretKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateDownloadSecretKeyResponseBody body;

    public static GenerateDownloadSecretKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDownloadSecretKeyResponse self = new GenerateDownloadSecretKeyResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDownloadSecretKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDownloadSecretKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateDownloadSecretKeyResponse setBody(GenerateDownloadSecretKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDownloadSecretKeyResponseBody getBody() {
        return this.body;
    }

}
