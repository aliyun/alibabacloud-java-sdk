// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckRdsCustomInitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckRdsCustomInitResponseBody body;

    public static CheckRdsCustomInitResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRdsCustomInitResponse self = new CheckRdsCustomInitResponse();
        return TeaModel.build(map, self);
    }

    public CheckRdsCustomInitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckRdsCustomInitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckRdsCustomInitResponse setBody(CheckRdsCustomInitResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRdsCustomInitResponseBody getBody() {
        return this.body;
    }

}
