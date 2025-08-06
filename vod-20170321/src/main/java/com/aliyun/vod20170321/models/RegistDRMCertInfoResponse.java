// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegistDRMCertInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegistDRMCertInfoResponseBody body;

    public static RegistDRMCertInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        RegistDRMCertInfoResponse self = new RegistDRMCertInfoResponse();
        return TeaModel.build(map, self);
    }

    public RegistDRMCertInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegistDRMCertInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegistDRMCertInfoResponse setBody(RegistDRMCertInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public RegistDRMCertInfoResponseBody getBody() {
        return this.body;
    }

}
