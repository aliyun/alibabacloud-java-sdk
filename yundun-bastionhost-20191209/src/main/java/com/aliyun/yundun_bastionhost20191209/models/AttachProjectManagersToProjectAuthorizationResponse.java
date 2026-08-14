// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachProjectManagersToProjectAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachProjectManagersToProjectAuthorizationResponseBody body;

    public static AttachProjectManagersToProjectAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachProjectManagersToProjectAuthorizationResponse self = new AttachProjectManagersToProjectAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public AttachProjectManagersToProjectAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachProjectManagersToProjectAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachProjectManagersToProjectAuthorizationResponse setBody(AttachProjectManagersToProjectAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachProjectManagersToProjectAuthorizationResponseBody getBody() {
        return this.body;
    }

}
