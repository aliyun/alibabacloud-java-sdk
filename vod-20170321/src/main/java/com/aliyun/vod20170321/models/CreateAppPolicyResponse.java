// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAppPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppPolicyResponseBody body;

    public static CreateAppPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppPolicyResponse self = new CreateAppPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppPolicyResponse setBody(CreateAppPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppPolicyResponseBody getBody() {
        return this.body;
    }

}
