// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDWSVpcAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDWSVpcAppResponseBody body;

    public static CreateDWSVpcAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDWSVpcAppResponse self = new CreateDWSVpcAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateDWSVpcAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDWSVpcAppResponse setBody(CreateDWSVpcAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDWSVpcAppResponseBody getBody() {
        return this.body;
    }

}
