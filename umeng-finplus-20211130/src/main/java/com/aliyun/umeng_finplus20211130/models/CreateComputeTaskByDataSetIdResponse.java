// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CreateComputeTaskByDataSetIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateComputeTaskByDataSetIdResponseBody body;

    public static CreateComputeTaskByDataSetIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeTaskByDataSetIdResponse self = new CreateComputeTaskByDataSetIdResponse();
        return TeaModel.build(map, self);
    }

    public CreateComputeTaskByDataSetIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComputeTaskByDataSetIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComputeTaskByDataSetIdResponse setBody(CreateComputeTaskByDataSetIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComputeTaskByDataSetIdResponseBody getBody() {
        return this.body;
    }

}
