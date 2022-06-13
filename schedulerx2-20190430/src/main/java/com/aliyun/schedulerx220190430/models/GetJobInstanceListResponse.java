// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class GetJobInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobInstanceListResponseBody body;

    public static GetJobInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobInstanceListResponse self = new GetJobInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public GetJobInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobInstanceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobInstanceListResponse setBody(GetJobInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobInstanceListResponseBody getBody() {
        return this.body;
    }

}
