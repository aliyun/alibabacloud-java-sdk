// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CheckFlsmFillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckFlsmFillResponseBody body;

    public static CheckFlsmFillResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckFlsmFillResponse self = new CheckFlsmFillResponse();
        return TeaModel.build(map, self);
    }

    public CheckFlsmFillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckFlsmFillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckFlsmFillResponse setBody(CheckFlsmFillResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckFlsmFillResponseBody getBody() {
        return this.body;
    }

}
