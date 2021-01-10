// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSContainerservicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAKSContainerservicesResponseBody body;

    public static CreateAKSContainerservicesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSContainerservicesResponse self = new CreateAKSContainerservicesResponse();
        return TeaModel.build(map, self);
    }

    public CreateAKSContainerservicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAKSContainerservicesResponse setBody(CreateAKSContainerservicesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAKSContainerservicesResponseBody getBody() {
        return this.body;
    }

}
