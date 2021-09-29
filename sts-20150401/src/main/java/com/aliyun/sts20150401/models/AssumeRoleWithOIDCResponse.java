// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleWithOIDCResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssumeRoleWithOIDCResponseBody body;

    public static AssumeRoleWithOIDCResponse build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleWithOIDCResponse self = new AssumeRoleWithOIDCResponse();
        return TeaModel.build(map, self);
    }

    public AssumeRoleWithOIDCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssumeRoleWithOIDCResponse setBody(AssumeRoleWithOIDCResponseBody body) {
        this.body = body;
        return this;
    }
    public AssumeRoleWithOIDCResponseBody getBody() {
        return this.body;
    }

}
