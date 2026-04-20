// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddWorksAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddWorksAuthorizationResponseBody body;

    public static AddWorksAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWorksAuthorizationResponse self = new AddWorksAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public AddWorksAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWorksAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddWorksAuthorizationResponse setBody(AddWorksAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWorksAuthorizationResponseBody getBody() {
        return this.body;
    }

}
