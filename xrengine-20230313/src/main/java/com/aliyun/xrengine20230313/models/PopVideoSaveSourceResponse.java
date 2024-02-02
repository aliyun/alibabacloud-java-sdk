// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopVideoSaveSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopVideoSaveSourceResponseBody body;

    public static PopVideoSaveSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        PopVideoSaveSourceResponse self = new PopVideoSaveSourceResponse();
        return TeaModel.build(map, self);
    }

    public PopVideoSaveSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopVideoSaveSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopVideoSaveSourceResponse setBody(PopVideoSaveSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public PopVideoSaveSourceResponseBody getBody() {
        return this.body;
    }

}
