// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ImportKMSSecretsForHostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportKMSSecretsForHostResponseBody body;

    public static ImportKMSSecretsForHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportKMSSecretsForHostResponse self = new ImportKMSSecretsForHostResponse();
        return TeaModel.build(map, self);
    }

    public ImportKMSSecretsForHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportKMSSecretsForHostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportKMSSecretsForHostResponse setBody(ImportKMSSecretsForHostResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportKMSSecretsForHostResponseBody getBody() {
        return this.body;
    }

}
