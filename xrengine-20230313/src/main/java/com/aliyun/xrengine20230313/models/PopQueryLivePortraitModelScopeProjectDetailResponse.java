// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopQueryLivePortraitModelScopeProjectDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopQueryLivePortraitModelScopeProjectDetailResponseBody body;

    public static PopQueryLivePortraitModelScopeProjectDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        PopQueryLivePortraitModelScopeProjectDetailResponse self = new PopQueryLivePortraitModelScopeProjectDetailResponse();
        return TeaModel.build(map, self);
    }

    public PopQueryLivePortraitModelScopeProjectDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopQueryLivePortraitModelScopeProjectDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopQueryLivePortraitModelScopeProjectDetailResponse setBody(PopQueryLivePortraitModelScopeProjectDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public PopQueryLivePortraitModelScopeProjectDetailResponseBody getBody() {
        return this.body;
    }

}
