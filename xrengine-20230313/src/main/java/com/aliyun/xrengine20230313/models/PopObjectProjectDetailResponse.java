// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopObjectProjectDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopObjectProjectDetailResponseBody body;

    public static PopObjectProjectDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        PopObjectProjectDetailResponse self = new PopObjectProjectDetailResponse();
        return TeaModel.build(map, self);
    }

    public PopObjectProjectDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopObjectProjectDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopObjectProjectDetailResponse setBody(PopObjectProjectDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public PopObjectProjectDetailResponseBody getBody() {
        return this.body;
    }

}
