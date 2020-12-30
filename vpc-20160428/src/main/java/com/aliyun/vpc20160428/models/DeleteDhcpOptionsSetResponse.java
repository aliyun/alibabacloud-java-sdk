// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteDhcpOptionsSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDhcpOptionsSetResponseBody body;

    public static DeleteDhcpOptionsSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDhcpOptionsSetResponse self = new DeleteDhcpOptionsSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDhcpOptionsSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDhcpOptionsSetResponse setBody(DeleteDhcpOptionsSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDhcpOptionsSetResponseBody getBody() {
        return this.body;
    }

}
