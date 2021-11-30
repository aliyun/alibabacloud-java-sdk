// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CreateComputeTaskByDataSetIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateComputeTaskByDataSetIdResponse setBody(CreateComputeTaskByDataSetIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComputeTaskByDataSetIdResponseBody getBody() {
        return this.body;
    }

}
