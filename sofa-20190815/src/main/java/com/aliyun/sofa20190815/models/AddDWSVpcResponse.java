// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddDWSVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDWSVpcResponseBody body;

    public static AddDWSVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDWSVpcResponse self = new AddDWSVpcResponse();
        return TeaModel.build(map, self);
    }

    public AddDWSVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDWSVpcResponse setBody(AddDWSVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDWSVpcResponseBody getBody() {
        return this.body;
    }

}
