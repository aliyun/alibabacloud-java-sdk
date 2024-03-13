// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoLogoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EraseVideoLogoResponseBody body;

    public static EraseVideoLogoResponse build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoLogoResponse self = new EraseVideoLogoResponse();
        return TeaModel.build(map, self);
    }

    public EraseVideoLogoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EraseVideoLogoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EraseVideoLogoResponse setBody(EraseVideoLogoResponseBody body) {
        this.body = body;
        return this;
    }
    public EraseVideoLogoResponseBody getBody() {
        return this.body;
    }

}
