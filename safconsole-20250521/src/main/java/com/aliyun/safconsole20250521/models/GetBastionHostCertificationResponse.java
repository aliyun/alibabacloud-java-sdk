// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class GetBastionHostCertificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBastionHostCertificationResponseBody body;

    public static GetBastionHostCertificationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBastionHostCertificationResponse self = new GetBastionHostCertificationResponse();
        return TeaModel.build(map, self);
    }

    public GetBastionHostCertificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBastionHostCertificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBastionHostCertificationResponse setBody(GetBastionHostCertificationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBastionHostCertificationResponseBody getBody() {
        return this.body;
    }

}
