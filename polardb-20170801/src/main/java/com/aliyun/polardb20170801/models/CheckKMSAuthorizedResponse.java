// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckKMSAuthorizedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckKMSAuthorizedResponseBody body;

    public static CheckKMSAuthorizedResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckKMSAuthorizedResponse self = new CheckKMSAuthorizedResponse();
        return TeaModel.build(map, self);
    }

    public CheckKMSAuthorizedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckKMSAuthorizedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckKMSAuthorizedResponse setBody(CheckKMSAuthorizedResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckKMSAuthorizedResponseBody getBody() {
        return this.body;
    }

}
