// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachProjectsToProjectAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachProjectsToProjectAuthorizationResponseBody body;

    public static AttachProjectsToProjectAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachProjectsToProjectAuthorizationResponse self = new AttachProjectsToProjectAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public AttachProjectsToProjectAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachProjectsToProjectAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachProjectsToProjectAuthorizationResponse setBody(AttachProjectsToProjectAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachProjectsToProjectAuthorizationResponseBody getBody() {
        return this.body;
    }

}
