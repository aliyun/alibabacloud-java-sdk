// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CheckSampleNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckSampleNameResponseBody body;

    public static CheckSampleNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSampleNameResponse self = new CheckSampleNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckSampleNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSampleNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSampleNameResponse setBody(CheckSampleNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSampleNameResponseBody getBody() {
        return this.body;
    }

}
