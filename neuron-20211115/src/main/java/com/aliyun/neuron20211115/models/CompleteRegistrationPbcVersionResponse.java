// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CompleteRegistrationPbcVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CompleteRegistrationPbcVersionResponseBody body;

    public static CompleteRegistrationPbcVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteRegistrationPbcVersionResponse self = new CompleteRegistrationPbcVersionResponse();
        return TeaModel.build(map, self);
    }

    public CompleteRegistrationPbcVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteRegistrationPbcVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompleteRegistrationPbcVersionResponse setBody(CompleteRegistrationPbcVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteRegistrationPbcVersionResponseBody getBody() {
        return this.body;
    }

}
