// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDWSVpcServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDWSVpcServerResponseBody body;

    public static DeleteDWSVpcServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDWSVpcServerResponse self = new DeleteDWSVpcServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDWSVpcServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDWSVpcServerResponse setBody(DeleteDWSVpcServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDWSVpcServerResponseBody getBody() {
        return this.body;
    }

}
