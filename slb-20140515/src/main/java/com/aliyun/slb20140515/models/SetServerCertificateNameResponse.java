// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetServerCertificateNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetServerCertificateNameResponseBody body;

    public static SetServerCertificateNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SetServerCertificateNameResponse self = new SetServerCertificateNameResponse();
        return TeaModel.build(map, self);
    }

    public SetServerCertificateNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetServerCertificateNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetServerCertificateNameResponse setBody(SetServerCertificateNameResponseBody body) {
        this.body = body;
        return this;
    }
    public SetServerCertificateNameResponseBody getBody() {
        return this.body;
    }

}
