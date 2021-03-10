// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CreateDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDataSourceResponseBody body;

    public static CreateDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceResponse self = new CreateDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataSourceResponse setBody(CreateDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataSourceResponseBody getBody() {
        return this.body;
    }

}
