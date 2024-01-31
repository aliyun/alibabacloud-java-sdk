// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UninstallRaspAttachResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallRaspAttachResponseBody body;

    public static UninstallRaspAttachResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallRaspAttachResponse self = new UninstallRaspAttachResponse();
        return TeaModel.build(map, self);
    }

    public UninstallRaspAttachResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallRaspAttachResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallRaspAttachResponse setBody(UninstallRaspAttachResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallRaspAttachResponseBody getBody() {
        return this.body;
    }

}
