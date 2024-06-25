// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIpamResponseBody body;

    public static CreateIpamResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamResponse self = new CreateIpamResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIpamResponse setBody(CreateIpamResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpamResponseBody getBody() {
        return this.body;
    }

}
