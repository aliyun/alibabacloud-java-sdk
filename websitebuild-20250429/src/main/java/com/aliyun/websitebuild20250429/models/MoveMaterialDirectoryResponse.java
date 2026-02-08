// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class MoveMaterialDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveMaterialDirectoryResponseBody body;

    public static MoveMaterialDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveMaterialDirectoryResponse self = new MoveMaterialDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public MoveMaterialDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveMaterialDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveMaterialDirectoryResponse setBody(MoveMaterialDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveMaterialDirectoryResponseBody getBody() {
        return this.body;
    }

}
