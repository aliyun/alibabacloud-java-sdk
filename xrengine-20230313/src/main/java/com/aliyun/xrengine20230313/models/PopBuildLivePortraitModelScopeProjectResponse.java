// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBuildLivePortraitModelScopeProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PopBuildLivePortraitModelScopeProjectResponseBody body;

    public static PopBuildLivePortraitModelScopeProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopBuildLivePortraitModelScopeProjectResponse self = new PopBuildLivePortraitModelScopeProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopBuildLivePortraitModelScopeProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopBuildLivePortraitModelScopeProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopBuildLivePortraitModelScopeProjectResponse setBody(PopBuildLivePortraitModelScopeProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopBuildLivePortraitModelScopeProjectResponseBody getBody() {
        return this.body;
    }

}
