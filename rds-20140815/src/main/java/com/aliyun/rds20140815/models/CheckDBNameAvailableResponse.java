// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckDBNameAvailableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDBNameAvailableResponseBody body;

    public static CheckDBNameAvailableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDBNameAvailableResponse self = new CheckDBNameAvailableResponse();
        return TeaModel.build(map, self);
    }

    public CheckDBNameAvailableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDBNameAvailableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDBNameAvailableResponse setBody(CheckDBNameAvailableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDBNameAvailableResponseBody getBody() {
        return this.body;
    }

}
