// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CreateComputeTaskByMultiDataSetIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateComputeTaskByMultiDataSetIdResponseBody body;

    public static CreateComputeTaskByMultiDataSetIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeTaskByMultiDataSetIdResponse self = new CreateComputeTaskByMultiDataSetIdResponse();
        return TeaModel.build(map, self);
    }

    public CreateComputeTaskByMultiDataSetIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComputeTaskByMultiDataSetIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComputeTaskByMultiDataSetIdResponse setBody(CreateComputeTaskByMultiDataSetIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComputeTaskByMultiDataSetIdResponseBody getBody() {
        return this.body;
    }

}
