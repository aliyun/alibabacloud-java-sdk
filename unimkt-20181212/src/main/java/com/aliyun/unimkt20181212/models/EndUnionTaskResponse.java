// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class EndUnionTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EndUnionTaskResponseBody body;

    public static EndUnionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        EndUnionTaskResponse self = new EndUnionTaskResponse();
        return TeaModel.build(map, self);
    }

    public EndUnionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EndUnionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EndUnionTaskResponse setBody(EndUnionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public EndUnionTaskResponseBody getBody() {
        return this.body;
    }

}
