// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetCACertificateNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetCACertificateNameResponseBody body;

    public static SetCACertificateNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCACertificateNameResponse self = new SetCACertificateNameResponse();
        return TeaModel.build(map, self);
    }

    public SetCACertificateNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCACertificateNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCACertificateNameResponse setBody(SetCACertificateNameResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCACertificateNameResponseBody getBody() {
        return this.body;
    }

}
