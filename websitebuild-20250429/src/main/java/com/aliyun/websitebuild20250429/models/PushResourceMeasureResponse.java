// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class PushResourceMeasureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushResourceMeasureResponseBody body;

    public static PushResourceMeasureResponse build(java.util.Map<String, ?> map) throws Exception {
        PushResourceMeasureResponse self = new PushResourceMeasureResponse();
        return TeaModel.build(map, self);
    }

    public PushResourceMeasureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushResourceMeasureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushResourceMeasureResponse setBody(PushResourceMeasureResponseBody body) {
        this.body = body;
        return this;
    }
    public PushResourceMeasureResponseBody getBody() {
        return this.body;
    }

}
