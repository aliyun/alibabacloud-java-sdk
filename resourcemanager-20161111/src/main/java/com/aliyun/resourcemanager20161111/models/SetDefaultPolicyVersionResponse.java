// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class SetDefaultPolicyVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetDefaultPolicyVersionResponseBody body;

    public static SetDefaultPolicyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultPolicyVersionResponse self = new SetDefaultPolicyVersionResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultPolicyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultPolicyVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDefaultPolicyVersionResponse setBody(SetDefaultPolicyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultPolicyVersionResponseBody getBody() {
        return this.body;
    }

}
