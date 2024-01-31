// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckAccountNameAvailableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAccountNameAvailableResponseBody body;

    public static CheckAccountNameAvailableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountNameAvailableResponse self = new CheckAccountNameAvailableResponse();
        return TeaModel.build(map, self);
    }

    public CheckAccountNameAvailableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAccountNameAvailableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAccountNameAvailableResponse setBody(CheckAccountNameAvailableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAccountNameAvailableResponseBody getBody() {
        return this.body;
    }

}
