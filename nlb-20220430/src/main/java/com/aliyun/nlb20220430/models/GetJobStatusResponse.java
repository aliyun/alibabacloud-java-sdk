// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobStatusResponseBody body;

    public static GetJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobStatusResponse self = new GetJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobStatusResponse setBody(GetJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobStatusResponseBody getBody() {
        return this.body;
    }

}
