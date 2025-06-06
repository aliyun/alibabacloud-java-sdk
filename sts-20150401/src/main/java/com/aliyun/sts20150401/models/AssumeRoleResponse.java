// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class AssumeRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssumeRoleResponseBody body;

    public static AssumeRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleResponse self = new AssumeRoleResponse();
        return TeaModel.build(map, self);
    }

    public AssumeRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssumeRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssumeRoleResponse setBody(AssumeRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public AssumeRoleResponseBody getBody() {
        return this.body;
    }

}
