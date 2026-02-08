// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class MoveMaterialFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveMaterialFileResponseBody body;

    public static MoveMaterialFileResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveMaterialFileResponse self = new MoveMaterialFileResponse();
        return TeaModel.build(map, self);
    }

    public MoveMaterialFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveMaterialFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveMaterialFileResponse setBody(MoveMaterialFileResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveMaterialFileResponseBody getBody() {
        return this.body;
    }

}
