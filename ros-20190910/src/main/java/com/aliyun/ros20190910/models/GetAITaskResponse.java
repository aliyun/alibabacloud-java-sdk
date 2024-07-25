// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetAITaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAITaskResponseBody body;

    public static GetAITaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAITaskResponse self = new GetAITaskResponse();
        return TeaModel.build(map, self);
    }

    public GetAITaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAITaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAITaskResponse setBody(GetAITaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAITaskResponseBody getBody() {
        return this.body;
    }

}
