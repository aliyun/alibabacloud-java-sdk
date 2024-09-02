// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20240830.models;

import com.aliyun.tea.*;

public class SubmitModelTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitModelTaskResponseBody body;

    public static SubmitModelTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitModelTaskResponse self = new SubmitModelTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitModelTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitModelTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitModelTaskResponse setBody(SubmitModelTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitModelTaskResponseBody getBody() {
        return this.body;
    }

}
