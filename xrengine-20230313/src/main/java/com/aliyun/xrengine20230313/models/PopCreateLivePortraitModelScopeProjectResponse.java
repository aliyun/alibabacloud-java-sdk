// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreateLivePortraitModelScopeProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopCreateLivePortraitModelScopeProjectResponseBody body;

    public static PopCreateLivePortraitModelScopeProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopCreateLivePortraitModelScopeProjectResponse self = new PopCreateLivePortraitModelScopeProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopCreateLivePortraitModelScopeProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopCreateLivePortraitModelScopeProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopCreateLivePortraitModelScopeProjectResponse setBody(PopCreateLivePortraitModelScopeProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopCreateLivePortraitModelScopeProjectResponseBody getBody() {
        return this.body;
    }

}
