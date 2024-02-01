// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddPublicIpAddressPoolCidrBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPublicIpAddressPoolCidrBlockResponseBody body;

    public static AddPublicIpAddressPoolCidrBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPublicIpAddressPoolCidrBlockResponse self = new AddPublicIpAddressPoolCidrBlockResponse();
        return TeaModel.build(map, self);
    }

    public AddPublicIpAddressPoolCidrBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPublicIpAddressPoolCidrBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPublicIpAddressPoolCidrBlockResponse setBody(AddPublicIpAddressPoolCidrBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPublicIpAddressPoolCidrBlockResponseBody getBody() {
        return this.body;
    }

}
