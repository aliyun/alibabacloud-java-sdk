// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class SaveActivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveActivityResponseBody body;

    public static SaveActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveActivityResponse self = new SaveActivityResponse();
        return TeaModel.build(map, self);
    }

    public SaveActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveActivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveActivityResponse setBody(SaveActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveActivityResponseBody getBody() {
        return this.body;
    }

}
