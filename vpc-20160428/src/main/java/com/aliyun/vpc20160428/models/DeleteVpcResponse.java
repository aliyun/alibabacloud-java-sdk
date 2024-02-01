// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVpcResponseBody body;

    public static DeleteVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcResponse self = new DeleteVpcResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVpcResponse setBody(DeleteVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVpcResponseBody getBody() {
        return this.body;
    }

}
