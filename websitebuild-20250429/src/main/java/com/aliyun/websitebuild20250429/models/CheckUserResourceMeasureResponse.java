// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CheckUserResourceMeasureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckUserResourceMeasureResponseBody body;

    public static CheckUserResourceMeasureResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUserResourceMeasureResponse self = new CheckUserResourceMeasureResponse();
        return TeaModel.build(map, self);
    }

    public CheckUserResourceMeasureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUserResourceMeasureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckUserResourceMeasureResponse setBody(CheckUserResourceMeasureResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUserResourceMeasureResponseBody getBody() {
        return this.body;
    }

}
