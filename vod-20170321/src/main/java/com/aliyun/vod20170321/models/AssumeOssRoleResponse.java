// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AssumeOssRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssumeOssRoleResponseBody body;

    public static AssumeOssRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AssumeOssRoleResponse self = new AssumeOssRoleResponse();
        return TeaModel.build(map, self);
    }

    public AssumeOssRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssumeOssRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssumeOssRoleResponse setBody(AssumeOssRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public AssumeOssRoleResponseBody getBody() {
        return this.body;
    }

}
