// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ResultCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResultCallbackResponseBody body;

    public static ResultCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ResultCallbackResponse self = new ResultCallbackResponse();
        return TeaModel.build(map, self);
    }

    public ResultCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResultCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResultCallbackResponse setBody(ResultCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ResultCallbackResponseBody getBody() {
        return this.body;
    }

}
