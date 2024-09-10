// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSasTrialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSasTrialResponseBody body;

    public static CreateSasTrialResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSasTrialResponse self = new CreateSasTrialResponse();
        return TeaModel.build(map, self);
    }

    public CreateSasTrialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSasTrialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSasTrialResponse setBody(CreateSasTrialResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSasTrialResponseBody getBody() {
        return this.body;
    }

}
