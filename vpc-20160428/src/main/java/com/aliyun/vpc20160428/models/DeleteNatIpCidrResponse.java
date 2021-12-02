// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNatIpCidrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNatIpCidrResponseBody body;

    public static DeleteNatIpCidrResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNatIpCidrResponse self = new DeleteNatIpCidrResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNatIpCidrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNatIpCidrResponse setBody(DeleteNatIpCidrResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNatIpCidrResponseBody getBody() {
        return this.body;
    }

}
