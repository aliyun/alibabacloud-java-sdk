// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SelectComputeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SelectComputeTaskResponseBody body;

    public static SelectComputeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SelectComputeTaskResponse self = new SelectComputeTaskResponse();
        return TeaModel.build(map, self);
    }

    public SelectComputeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SelectComputeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SelectComputeTaskResponse setBody(SelectComputeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SelectComputeTaskResponseBody getBody() {
        return this.body;
    }

}
