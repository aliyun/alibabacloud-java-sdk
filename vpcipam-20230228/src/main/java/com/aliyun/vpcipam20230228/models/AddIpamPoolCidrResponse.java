// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class AddIpamPoolCidrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddIpamPoolCidrResponseBody body;

    public static AddIpamPoolCidrResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIpamPoolCidrResponse self = new AddIpamPoolCidrResponse();
        return TeaModel.build(map, self);
    }

    public AddIpamPoolCidrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddIpamPoolCidrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddIpamPoolCidrResponse setBody(AddIpamPoolCidrResponseBody body) {
        this.body = body;
        return this;
    }
    public AddIpamPoolCidrResponseBody getBody() {
        return this.body;
    }

}
