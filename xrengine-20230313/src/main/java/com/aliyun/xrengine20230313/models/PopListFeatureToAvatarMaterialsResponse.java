// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListFeatureToAvatarMaterialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopListFeatureToAvatarMaterialsResponseBody body;

    public static PopListFeatureToAvatarMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        PopListFeatureToAvatarMaterialsResponse self = new PopListFeatureToAvatarMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public PopListFeatureToAvatarMaterialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopListFeatureToAvatarMaterialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopListFeatureToAvatarMaterialsResponse setBody(PopListFeatureToAvatarMaterialsResponseBody body) {
        this.body = body;
        return this;
    }
    public PopListFeatureToAvatarMaterialsResponseBody getBody() {
        return this.body;
    }

}
