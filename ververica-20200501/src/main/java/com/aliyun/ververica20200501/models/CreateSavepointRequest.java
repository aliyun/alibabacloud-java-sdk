// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class CreateSavepointRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSavepointBody body;

    public static CreateSavepointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSavepointRequest self = new CreateSavepointRequest();
        return TeaModel.build(map, self);
    }

    public CreateSavepointRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSavepointRequest setBody(CreateSavepointBody body) {
        this.body = body;
        return this;
    }
    public CreateSavepointBody getBody() {
        return this.body;
    }

}
