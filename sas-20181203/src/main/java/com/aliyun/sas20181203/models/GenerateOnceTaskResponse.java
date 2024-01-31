// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GenerateOnceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateOnceTaskResponseBody body;

    public static GenerateOnceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateOnceTaskResponse self = new GenerateOnceTaskResponse();
        return TeaModel.build(map, self);
    }

    public GenerateOnceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateOnceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateOnceTaskResponse setBody(GenerateOnceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateOnceTaskResponseBody getBody() {
        return this.body;
    }

}
