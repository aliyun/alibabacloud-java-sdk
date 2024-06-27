// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CheckUsageVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckUsageVariableResponseBody body;

    public static CheckUsageVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUsageVariableResponse self = new CheckUsageVariableResponse();
        return TeaModel.build(map, self);
    }

    public CheckUsageVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUsageVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckUsageVariableResponse setBody(CheckUsageVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUsageVariableResponseBody getBody() {
        return this.body;
    }

}
