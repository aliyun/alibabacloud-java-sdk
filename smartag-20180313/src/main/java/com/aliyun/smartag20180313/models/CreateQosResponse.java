// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateQosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateQosResponseBody body;

    public static CreateQosResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQosResponse self = new CreateQosResponse();
        return TeaModel.build(map, self);
    }

    public CreateQosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQosResponse setBody(CreateQosResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQosResponseBody getBody() {
        return this.body;
    }

}
