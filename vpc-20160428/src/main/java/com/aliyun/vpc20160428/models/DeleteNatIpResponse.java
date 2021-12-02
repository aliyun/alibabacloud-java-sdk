// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNatIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNatIpResponseBody body;

    public static DeleteNatIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatIpResponse self = new DeleteNatIpResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNatIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNatIpResponse setBody(DeleteNatIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNatIpResponseBody getBody() {
        return this.body;
    }

}
