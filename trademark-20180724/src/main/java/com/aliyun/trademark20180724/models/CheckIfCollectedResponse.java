// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CheckIfCollectedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckIfCollectedResponseBody body;

    public static CheckIfCollectedResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckIfCollectedResponse self = new CheckIfCollectedResponse();
        return TeaModel.build(map, self);
    }

    public CheckIfCollectedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckIfCollectedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckIfCollectedResponse setBody(CheckIfCollectedResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckIfCollectedResponseBody getBody() {
        return this.body;
    }

}
