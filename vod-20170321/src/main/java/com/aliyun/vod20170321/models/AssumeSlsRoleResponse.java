// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AssumeSlsRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssumeSlsRoleResponseBody body;

    public static AssumeSlsRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AssumeSlsRoleResponse self = new AssumeSlsRoleResponse();
        return TeaModel.build(map, self);
    }

    public AssumeSlsRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssumeSlsRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssumeSlsRoleResponse setBody(AssumeSlsRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public AssumeSlsRoleResponseBody getBody() {
        return this.body;
    }

}
