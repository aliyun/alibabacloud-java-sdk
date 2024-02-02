// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListLivePortraitModelScopeMaterialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopListLivePortraitModelScopeMaterialsResponseBody body;

    public static PopListLivePortraitModelScopeMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        PopListLivePortraitModelScopeMaterialsResponse self = new PopListLivePortraitModelScopeMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public PopListLivePortraitModelScopeMaterialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopListLivePortraitModelScopeMaterialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopListLivePortraitModelScopeMaterialsResponse setBody(PopListLivePortraitModelScopeMaterialsResponseBody body) {
        this.body = body;
        return this;
    }
    public PopListLivePortraitModelScopeMaterialsResponseBody getBody() {
        return this.body;
    }

}
