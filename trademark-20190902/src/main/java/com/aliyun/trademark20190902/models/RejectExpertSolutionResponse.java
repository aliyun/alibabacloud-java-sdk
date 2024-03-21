// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class RejectExpertSolutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RejectExpertSolutionResponseBody body;

    public static RejectExpertSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectExpertSolutionResponse self = new RejectExpertSolutionResponse();
        return TeaModel.build(map, self);
    }

    public RejectExpertSolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectExpertSolutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RejectExpertSolutionResponse setBody(RejectExpertSolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectExpertSolutionResponseBody getBody() {
        return this.body;
    }

}
