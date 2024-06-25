// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIpamScopeResponseBody body;

    public static CreateIpamScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamScopeResponse self = new CreateIpamScopeResponse();
        return TeaModel.build(map, self);
    }

    public CreateIpamScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIpamScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIpamScopeResponse setBody(CreateIpamScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIpamScopeResponseBody getBody() {
        return this.body;
    }

}
