// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CheckFieldLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckFieldLimitResponseBody body;

    public static CheckFieldLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckFieldLimitResponse self = new CheckFieldLimitResponse();
        return TeaModel.build(map, self);
    }

    public CheckFieldLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckFieldLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckFieldLimitResponse setBody(CheckFieldLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckFieldLimitResponseBody getBody() {
        return this.body;
    }

}
