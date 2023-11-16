// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateK8sAccessInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateK8sAccessInfoResponseBody body;

    public static GenerateK8sAccessInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateK8sAccessInfoResponse self = new GenerateK8sAccessInfoResponse();
        return TeaModel.build(map, self);
    }

    public GenerateK8sAccessInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateK8sAccessInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateK8sAccessInfoResponse setBody(GenerateK8sAccessInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateK8sAccessInfoResponseBody getBody() {
        return this.body;
    }

}
