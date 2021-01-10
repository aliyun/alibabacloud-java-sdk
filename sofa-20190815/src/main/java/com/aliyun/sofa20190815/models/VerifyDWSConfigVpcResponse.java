// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class VerifyDWSConfigVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyDWSConfigVpcResponseBody body;

    public static VerifyDWSConfigVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyDWSConfigVpcResponse self = new VerifyDWSConfigVpcResponse();
        return TeaModel.build(map, self);
    }

    public VerifyDWSConfigVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyDWSConfigVpcResponse setBody(VerifyDWSConfigVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyDWSConfigVpcResponseBody getBody() {
        return this.body;
    }

}
