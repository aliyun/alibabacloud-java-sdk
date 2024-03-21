// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ConfirmExpertSolutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmExpertSolutionResponseBody body;

    public static ConfirmExpertSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmExpertSolutionResponse self = new ConfirmExpertSolutionResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmExpertSolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmExpertSolutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmExpertSolutionResponse setBody(ConfirmExpertSolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmExpertSolutionResponseBody getBody() {
        return this.body;
    }

}
