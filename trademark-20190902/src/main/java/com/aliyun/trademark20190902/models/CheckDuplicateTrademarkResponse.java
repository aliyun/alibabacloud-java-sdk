// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckDuplicateTrademarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDuplicateTrademarkResponseBody body;

    public static CheckDuplicateTrademarkResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDuplicateTrademarkResponse self = new CheckDuplicateTrademarkResponse();
        return TeaModel.build(map, self);
    }

    public CheckDuplicateTrademarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDuplicateTrademarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDuplicateTrademarkResponse setBody(CheckDuplicateTrademarkResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDuplicateTrademarkResponseBody getBody() {
        return this.body;
    }

}
