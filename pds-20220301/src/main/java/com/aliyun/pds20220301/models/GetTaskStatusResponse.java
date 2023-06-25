// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskStatusResponseBody body;

    public static GetTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusResponse self = new GetTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskStatusResponse setBody(GetTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskStatusResponseBody getBody() {
        return this.body;
    }

}
