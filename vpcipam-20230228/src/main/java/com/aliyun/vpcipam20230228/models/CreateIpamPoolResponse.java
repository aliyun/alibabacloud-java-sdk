// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIpamPoolResponseBody body;

    public static CreateIpamPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamPoolResponse self = new CreateIpamPoolResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpamPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpamPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIpamPoolResponse setBody(CreateIpamPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpamPoolResponseBody getBody() {
        return this.body;
    }

}
