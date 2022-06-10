// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeletePublicIpAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePublicIpAddressPoolResponseBody body;

    public static DeletePublicIpAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicIpAddressPoolResponse self = new DeletePublicIpAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public DeletePublicIpAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePublicIpAddressPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePublicIpAddressPoolResponse setBody(DeletePublicIpAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePublicIpAddressPoolResponseBody getBody() {
        return this.body;
    }

}
