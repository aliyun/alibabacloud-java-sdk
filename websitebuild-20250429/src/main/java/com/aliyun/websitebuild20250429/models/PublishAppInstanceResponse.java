// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class PublishAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishAppInstanceResponseBody body;

    public static PublishAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishAppInstanceResponse self = new PublishAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public PublishAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishAppInstanceResponse setBody(PublishAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishAppInstanceResponseBody getBody() {
        return this.body;
    }

}
