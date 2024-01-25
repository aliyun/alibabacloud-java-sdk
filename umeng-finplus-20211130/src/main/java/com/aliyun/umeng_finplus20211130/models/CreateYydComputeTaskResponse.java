// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CreateYydComputeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateYydComputeTaskResponseBody body;

    public static CreateYydComputeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateYydComputeTaskResponse self = new CreateYydComputeTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateYydComputeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateYydComputeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateYydComputeTaskResponse setBody(CreateYydComputeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateYydComputeTaskResponseBody getBody() {
        return this.body;
    }

}
