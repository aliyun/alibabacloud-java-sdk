// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckDBNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDBNameResponseBody body;

    public static CheckDBNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDBNameResponse self = new CheckDBNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckDBNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDBNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDBNameResponse setBody(CheckDBNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDBNameResponseBody getBody() {
        return this.body;
    }

}
