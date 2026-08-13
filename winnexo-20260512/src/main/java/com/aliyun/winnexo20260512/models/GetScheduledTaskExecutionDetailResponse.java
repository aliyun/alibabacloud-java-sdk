// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskExecutionDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScheduledTaskExecutionDetailResponseBody body;

    public static GetScheduledTaskExecutionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskExecutionDetailResponse self = new GetScheduledTaskExecutionDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskExecutionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduledTaskExecutionDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScheduledTaskExecutionDetailResponse setBody(GetScheduledTaskExecutionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduledTaskExecutionDetailResponseBody getBody() {
        return this.body;
    }

}
