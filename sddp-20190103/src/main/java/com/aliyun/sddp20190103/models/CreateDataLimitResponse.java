// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateDataLimitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDataLimitResponseBody body;

    public static CreateDataLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataLimitResponse self = new CreateDataLimitResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataLimitResponse setBody(CreateDataLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataLimitResponseBody getBody() {
        return this.body;
    }

}
