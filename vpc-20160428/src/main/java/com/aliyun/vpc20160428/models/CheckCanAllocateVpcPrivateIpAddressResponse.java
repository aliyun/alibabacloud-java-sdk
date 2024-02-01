// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CheckCanAllocateVpcPrivateIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckCanAllocateVpcPrivateIpAddressResponseBody body;

    public static CheckCanAllocateVpcPrivateIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCanAllocateVpcPrivateIpAddressResponse self = new CheckCanAllocateVpcPrivateIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public CheckCanAllocateVpcPrivateIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCanAllocateVpcPrivateIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCanAllocateVpcPrivateIpAddressResponse setBody(CheckCanAllocateVpcPrivateIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCanAllocateVpcPrivateIpAddressResponseBody getBody() {
        return this.body;
    }

}
