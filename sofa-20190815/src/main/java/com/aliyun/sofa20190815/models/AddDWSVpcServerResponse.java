// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddDWSVpcServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDWSVpcServerResponseBody body;

    public static AddDWSVpcServerResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDWSVpcServerResponse self = new AddDWSVpcServerResponse();
        return TeaModel.build(map, self);
    }

    public AddDWSVpcServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDWSVpcServerResponse setBody(AddDWSVpcServerResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDWSVpcServerResponseBody getBody() {
        return this.body;
    }

}
