// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeLinktProjectroleforuserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveLinkeLinktProjectroleforuserResponseBody body;

    public static RemoveLinkeLinktProjectroleforuserResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeLinktProjectroleforuserResponse self = new RemoveLinkeLinktProjectroleforuserResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeLinktProjectroleforuserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLinkeLinktProjectroleforuserResponse setBody(RemoveLinkeLinktProjectroleforuserResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLinkeLinktProjectroleforuserResponseBody getBody() {
        return this.body;
    }

}
