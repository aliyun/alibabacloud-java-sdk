// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CheckResourceMeasureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckResourceMeasureResponseBody body;

    public static CheckResourceMeasureResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceMeasureResponse self = new CheckResourceMeasureResponse();
        return TeaModel.build(map, self);
    }

    public CheckResourceMeasureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckResourceMeasureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckResourceMeasureResponse setBody(CheckResourceMeasureResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckResourceMeasureResponseBody getBody() {
        return this.body;
    }

}
