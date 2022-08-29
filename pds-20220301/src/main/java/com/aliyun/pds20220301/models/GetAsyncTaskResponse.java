// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetAsyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAsyncTaskResponseBody body;

    public static GetAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncTaskResponse self = new GetAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetAsyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAsyncTaskResponse setBody(GetAsyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsyncTaskResponseBody getBody() {
        return this.body;
    }

}
