// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetHotUpdateJobResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotUpdateJobResultResponseBody body;

    public static GetHotUpdateJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotUpdateJobResultResponse self = new GetHotUpdateJobResultResponse();
        return TeaModel.build(map, self);
    }

    public GetHotUpdateJobResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotUpdateJobResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotUpdateJobResultResponse setBody(GetHotUpdateJobResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotUpdateJobResultResponseBody getBody() {
        return this.body;
    }

}
