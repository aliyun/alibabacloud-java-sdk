// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachProjectsFromProjectAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachProjectsFromProjectAuthorizationResponseBody body;

    public static DetachProjectsFromProjectAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachProjectsFromProjectAuthorizationResponse self = new DetachProjectsFromProjectAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public DetachProjectsFromProjectAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachProjectsFromProjectAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachProjectsFromProjectAuthorizationResponse setBody(DetachProjectsFromProjectAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachProjectsFromProjectAuthorizationResponseBody getBody() {
        return this.body;
    }

}
