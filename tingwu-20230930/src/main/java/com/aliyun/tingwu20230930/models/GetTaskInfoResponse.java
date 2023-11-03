// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class GetTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskInfoResponseBody body;

    public static GetTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskInfoResponse self = new GetTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskInfoResponse setBody(GetTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskInfoResponseBody getBody() {
        return this.body;
    }

}
