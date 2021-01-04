// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateQosCarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateQosCarResponseBody body;

    public static CreateQosCarResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQosCarResponse self = new CreateQosCarResponse();
        return TeaModel.build(map, self);
    }

    public CreateQosCarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQosCarResponse setBody(CreateQosCarResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQosCarResponseBody getBody() {
        return this.body;
    }

}
