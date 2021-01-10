// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCellResponseBody body;

    public static CreateCellResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCellResponse self = new CreateCellResponse();
        return TeaModel.build(map, self);
    }

    public CreateCellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCellResponse setBody(CreateCellResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCellResponseBody getBody() {
        return this.body;
    }

}
