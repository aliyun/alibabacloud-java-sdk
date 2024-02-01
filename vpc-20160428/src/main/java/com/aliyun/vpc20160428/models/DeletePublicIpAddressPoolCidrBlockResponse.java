// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeletePublicIpAddressPoolCidrBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePublicIpAddressPoolCidrBlockResponseBody body;

    public static DeletePublicIpAddressPoolCidrBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicIpAddressPoolCidrBlockResponse self = new DeletePublicIpAddressPoolCidrBlockResponse();
        return TeaModel.build(map, self);
    }

    public DeletePublicIpAddressPoolCidrBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePublicIpAddressPoolCidrBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePublicIpAddressPoolCidrBlockResponse setBody(DeletePublicIpAddressPoolCidrBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePublicIpAddressPoolCidrBlockResponseBody getBody() {
        return this.body;
    }

}
