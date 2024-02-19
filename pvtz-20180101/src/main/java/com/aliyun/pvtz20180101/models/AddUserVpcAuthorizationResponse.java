// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddUserVpcAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUserVpcAuthorizationResponseBody body;

    public static AddUserVpcAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserVpcAuthorizationResponse self = new AddUserVpcAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public AddUserVpcAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserVpcAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserVpcAuthorizationResponse setBody(AddUserVpcAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserVpcAuthorizationResponseBody getBody() {
        return this.body;
    }

}
