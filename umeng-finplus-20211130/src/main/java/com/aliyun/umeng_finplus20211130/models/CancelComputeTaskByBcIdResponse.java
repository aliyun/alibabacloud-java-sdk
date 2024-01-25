// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CancelComputeTaskByBcIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelComputeTaskByBcIdResponseBody body;

    public static CancelComputeTaskByBcIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelComputeTaskByBcIdResponse self = new CancelComputeTaskByBcIdResponse();
        return TeaModel.build(map, self);
    }

    public CancelComputeTaskByBcIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelComputeTaskByBcIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelComputeTaskByBcIdResponse setBody(CancelComputeTaskByBcIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelComputeTaskByBcIdResponseBody getBody() {
        return this.body;
    }

}
