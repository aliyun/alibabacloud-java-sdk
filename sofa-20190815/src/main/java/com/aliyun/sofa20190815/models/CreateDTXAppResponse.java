// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDTXAppResponseBody body;

    public static CreateDTXAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXAppResponse self = new CreateDTXAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateDTXAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDTXAppResponse setBody(CreateDTXAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDTXAppResponseBody getBody() {
        return this.body;
    }

}
