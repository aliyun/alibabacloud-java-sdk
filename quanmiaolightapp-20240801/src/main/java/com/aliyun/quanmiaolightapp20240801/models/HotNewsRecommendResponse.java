// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class HotNewsRecommendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotNewsRecommendResponseBody body;

    public static HotNewsRecommendResponse build(java.util.Map<String, ?> map) throws Exception {
        HotNewsRecommendResponse self = new HotNewsRecommendResponse();
        return TeaModel.build(map, self);
    }

    public HotNewsRecommendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotNewsRecommendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotNewsRecommendResponse setBody(HotNewsRecommendResponseBody body) {
        this.body = body;
        return this;
    }
    public HotNewsRecommendResponseBody getBody() {
        return this.body;
    }

}
