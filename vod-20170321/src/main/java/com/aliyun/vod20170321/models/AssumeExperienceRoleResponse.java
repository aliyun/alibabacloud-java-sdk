// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AssumeExperienceRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssumeExperienceRoleResponseBody body;

    public static AssumeExperienceRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AssumeExperienceRoleResponse self = new AssumeExperienceRoleResponse();
        return TeaModel.build(map, self);
    }

    public AssumeExperienceRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssumeExperienceRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssumeExperienceRoleResponse setBody(AssumeExperienceRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public AssumeExperienceRoleResponseBody getBody() {
        return this.body;
    }

}
