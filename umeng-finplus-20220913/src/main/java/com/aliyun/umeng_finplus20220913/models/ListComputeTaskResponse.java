// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class ListComputeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListComputeTaskResponseBody body;

    public static ListComputeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComputeTaskResponse self = new ListComputeTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListComputeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComputeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComputeTaskResponse setBody(ListComputeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComputeTaskResponseBody getBody() {
        return this.body;
    }

}
